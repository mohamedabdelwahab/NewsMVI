package com.mohamed.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "search_keys")
data class SearchKey(
    @PrimaryKey val searchQuery: String,
    val nextPageKey: Int
)