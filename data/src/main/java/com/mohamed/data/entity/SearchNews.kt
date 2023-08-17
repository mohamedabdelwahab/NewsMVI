package com.mohamed.data.entity

import androidx.room.Entity

@Entity(tableName = "search_news", primaryKeys = ["searchQuery", "newsUrl"])
class SearchNews(
    val searchQuery: String,
    val newsUrl: String,
    val sort: Int
)