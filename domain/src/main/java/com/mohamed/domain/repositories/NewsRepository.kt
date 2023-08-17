package com.mohamed.domain.repositories

import androidx.paging.PagingData
import com.mohamed.domain.model.NewsDto
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getSearchResultsPaged(
        query: String,
        refreshOnInit: Boolean
    ): Flow<PagingData<NewsDto>>

}