package com.mohamed.data.repositeries

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.mohamed.data.source.local.NewsDatabase
import com.mohamed.data.source.remote.NewsService
import com.mohamed.data.source.remote.SearchNewsRemoteMediator
import com.mohamed.domain.model.NewsDto
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsApi: NewsService,
    private val newsArticleDb: NewsDatabase
) {
    private val newsArticleDao = newsArticleDb.newsDao()

    @OptIn(ExperimentalPagingApi::class)
    fun getSearchResultsPaged(
        query: String,
        refreshOnInit: Boolean
    ): Flow<PagingData<NewsDto>> =
        Pager(
            config = PagingConfig(pageSize = 20, maxSize = 200),
            remoteMediator = SearchNewsRemoteMediator(query, newsApi, newsArticleDb, refreshOnInit),
            pagingSourceFactory = { newsArticleDao.getSearchResultArticlesPaged(query) }
        ).flow


}