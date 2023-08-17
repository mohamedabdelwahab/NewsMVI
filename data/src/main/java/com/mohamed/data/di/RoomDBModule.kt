package com.mohamed.data.di

import android.content.Context
import androidx.room.Room
import com.mohamed.data.source.local.NewsDao
import com.mohamed.data.source.local.NewsDatabase
import com.mohamed.data.source.local.SearchKeyDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomDBModule {

    @Provides
    @Singleton
    fun provideRoomDB(@ApplicationContext appContext: Context): NewsDatabase =
        Room.databaseBuilder(
            appContext,
            NewsDatabase::class.java,
            "products_database.db"
        ).fallbackToDestructiveMigration().build()

    @Provides
    @Singleton
    fun provideNewsDAO(productsRoomDB: NewsDatabase): NewsDao =
        productsRoomDB.newsDao()

    @Provides
    @Singleton
    fun provideSearchDAO(productsRoomDB: NewsDatabase): SearchKeyDao =
        productsRoomDB.searchQueryRemoteKeyDao()
}