package com.mohamed.data.di

import com.mohamed.data.repositeries.AppPreferencesImp
import com.mohamed.data.repositeries.NewsRepositoryImp
import com.mohamed.domain.repositories.ISharedPrefrance
import com.mohamed.domain.repositories.NewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindNewsRepository(newsRepository: NewsRepositoryImp): NewsRepository

    @Binds
    @Singleton
    abstract fun bindPrefernces(newsRepository: AppPreferencesImp): ISharedPrefrance
}