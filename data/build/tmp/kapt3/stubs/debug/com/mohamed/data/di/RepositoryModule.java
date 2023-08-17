package com.mohamed.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/mohamed/data/di/RepositoryModule;", "", "()V", "bindNewsRepository", "Lcom/mohamed/domain/repositories/NewsRepository;", "newsRepository", "Lcom/mohamed/data/repositeries/NewsRepositoryImp;", "bindPrefernces", "Lcom/mohamed/domain/repositories/ISharedPrefrance;", "Lcom/mohamed/data/repositeries/AppPreferencesImp;", "data_debug"})
@dagger.Module
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.mohamed.domain.repositories.NewsRepository bindNewsRepository(@org.jetbrains.annotations.NotNull
    com.mohamed.data.repositeries.NewsRepositoryImp newsRepository);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.mohamed.domain.repositories.ISharedPrefrance bindPrefernces(@org.jetbrains.annotations.NotNull
    com.mohamed.data.repositeries.AppPreferencesImp newsRepository);
}