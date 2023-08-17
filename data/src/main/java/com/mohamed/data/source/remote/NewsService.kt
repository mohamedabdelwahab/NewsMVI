package com.mohamed.data.source.remote

import com.mohamed.data.entity.NewsResponse
import retrofit2.http.*

interface NewsService {

    @GET("everything")
    suspend fun searchNews(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("pageSize") pageSize: Int
    ): NewsResponse
}