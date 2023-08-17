package com.mohamed.domain.usecases

import androidx.paging.PagingData
import com.mohamed.domain.entity.NewsDto
import com.mohamed.domain.repositories.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsUseCase @Inject constructor(
    private val repository: NewsRepository
) {
    suspend operator fun invoke(
        query: String, refreshOnInit: Boolean
    ): Flow<PagingData<NewsDto>> {
        return repository.getSearchResultsPaged(query, refreshOnInit)
    }
}