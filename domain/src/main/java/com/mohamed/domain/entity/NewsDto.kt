package com.mohamed.domain.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "news")
data class NewsDto(
    @PrimaryKey
    val url: String,

    val publishedAt: String? = null,

    val author: String? = null,

    val urlToImage: String? = null,

    val description: String? = null,

    val title: String? = null,

    val content: String? = null,

    val source: String? = null,
) : Parcelable