
package com.mohamed.data.source.remote

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.mohamed.data.entity.SearchKey
import com.mohamed.data.entity.SearchNews
import com.mohamed.data.source.local.NewsDatabase
import com.mohamed.domain.model.NewsDto
import retrofit2.HttpException
import java.io.IOException


private const val NEWS_STARTING_PAGE_INDEX = 1

@ExperimentalPagingApi
class SearchNewsRemoteMediator(
    private val searchQuery: String,
    private val newsApi: NewsService,
    private val newsArticleDb: NewsDatabase,
    private val refreshOnInit: Boolean
) : RemoteMediator<Int, NewsDto>() {

    private val newsArticleDao = newsArticleDb.newsDao()
    private val searchQueryRemoteKeyDao = newsArticleDb.searchQueryRemoteKeyDao()

    @ExperimentalPagingApi
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, NewsDto>
    ): MediatorResult {

        val page = when (loadType) {
            LoadType.REFRESH -> NEWS_STARTING_PAGE_INDEX
            LoadType.PREPEND -> return MediatorResult.Success(endOfPaginationReached = true)
            LoadType.APPEND -> searchQueryRemoteKeyDao.getRemoteKey(searchQuery).nextPageKey
        }

        try {
            val response = newsApi.searchNews(searchQuery, page, state.config.pageSize)
            val serverSearchResults = response.articles


            val searchResultArticles = serverSearchResults?.map { serverSearchResultArticle ->
                NewsDto(
                    title = serverSearchResultArticle.title,
                    url = serverSearchResultArticle.url,
                    urlToImage = serverSearchResultArticle.urlToImage,
                )
            }

            newsArticleDb.withTransaction {
                if (loadType == LoadType.REFRESH) {
                    newsArticleDao.deleteSearchResultsForQuery(searchQuery)
                }

                val lastQueryPosition = newsArticleDao.getLastPosition(searchQuery) ?: 0
                var queryPosition = lastQueryPosition + 1

                val searchResults = searchResultArticles?.map { article ->
                    SearchNews(searchQuery, article.url, queryPosition++)
                }

                val nextPageKey = page + 1

                if (searchResultArticles != null) {
                    newsArticleDao.insertArticles(searchResultArticles)
                }
                if (searchResults != null) {
                    newsArticleDao.insertSearchResults(searchResults)
                }
                searchQueryRemoteKeyDao.insertRemoteKey(
                    SearchKey(searchQuery, nextPageKey)
                )
            }
            return MediatorResult.Success(
                endOfPaginationReached = serverSearchResults?.isEmpty() ?: true
            )
        } catch (exception: IOException) {
            return MediatorResult.Error(exception)
        } catch (exception: HttpException) {
            return MediatorResult.Error(exception)
        }
    }

    @ExperimentalPagingApi
    override suspend fun initialize(): InitializeAction {
        return if (refreshOnInit) {
            InitializeAction.LAUNCH_INITIAL_REFRESH
        } else {
            InitializeAction.SKIP_INITIAL_REFRESH
        }
    }
}