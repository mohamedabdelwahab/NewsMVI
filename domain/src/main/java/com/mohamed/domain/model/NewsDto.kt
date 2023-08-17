package com.mohamed.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news")
data class NewsDto(
    @PrimaryKey
    val url: String? = null,

    val publishedAt: String? = null,

    val author: String? = null,

    val urlToImage: String? = null,

    val description: String? = null,

    val title: String? = null,

    val content: String? = null,

    val source: String? = null,
)