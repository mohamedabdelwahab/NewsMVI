package com.mohamed.data.repositeries

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.mohamed.data.source.local.NewsDatabase
import com.mohamed.data.source.remote.NewsService
import com.mohamed.data.source.remote.SearchNewsRemoteMediator
import com.mohamed.domain.entity.NewsDto
import com.mohamed.domain.repositories.ISharedPrefrance
import com.mohamed.domain.repositories.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsRepositoryImp @Inject constructor(
    private val newsApi: NewsService,
    private val newsArticleDb: NewsDatabase,
    private val  iSharedPrefrance: ISharedPrefrance
) : NewsRepository {
    private val newsArticleDao = newsArticleDb.newsDao()

    @OptIn(ExperimentalPagingApi::class)
    override fun getSearchResultsPaged(
        query: String,
        refreshOnInit: Boolean
    ): Flow<PagingData<NewsDto>> =
        Pager(
            config = PagingConfig(pageSize = 20, maxSize = 200),
            remoteMediator = SearchNewsRemoteMediator(query, newsApi, newsArticleDb, refreshOnInit,iSharedPrefrance.getLang()),
            pagingSourceFactory = { newsArticleDao.getSearchResultArticlesPaged(query) }
        ).flow

}