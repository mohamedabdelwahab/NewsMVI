package com.mohamed.data.source.local

import androidx.paging.PagingSource
import androidx.room.*
import com.mohamed.data.entity.SearchNews
import com.mohamed.domain.model.NewsDto
import kotlinx.coroutines.flow.Flow

@Dao
interface NewsDao {

    @Query("SELECT * FROM search_results INNER JOIN news ON articleUrl = url WHERE searchQuery = :query ORDER BY sort")
    fun getSearchResultArticlesPaged(query: String): PagingSource<Int, NewsDto>

    @Query("SELECT MAX(sort) FROM search_results WHERE searchQuery = :searchQuery")
    suspend fun getLastPosition(searchQuery: String): Int?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticles(articles: List<NewsDto>)

    @Query("DELETE FROM search_results WHERE searchQuery = :query")
    suspend fun deleteSearchResultsForQuery(query: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSearchResults(searchResults: List<SearchNews>)

}