package com.mohamed.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mohamed.data.entity.SearchKey
import com.mohamed.data.entity.SearchNews
import com.mohamed.domain.entity.NewsDto

@Database(
    entities = [NewsDto::class, SearchNews::class, SearchKey::class],
    version = 1, exportSchema = false
)
abstract class NewsDatabase : RoomDatabase() {

    abstract fun newsDao(): NewsDao

    abstract fun searchQueryRemoteKeyDao(): SearchKeyDao
}