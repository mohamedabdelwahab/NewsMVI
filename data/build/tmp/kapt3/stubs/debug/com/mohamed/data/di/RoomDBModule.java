package com.mohamed.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/mohamed/data/di/RoomDBModule;", "", "()V", "provideNewsDAO", "Lcom/mohamed/data/source/local/NewsDao;", "productsRoomDB", "Lcom/mohamed/data/source/local/NewsDatabase;", "provideRoomDB", "appContext", "Landroid/content/Context;", "provideSearchDAO", "Lcom/mohamed/data/source/local/SearchKeyDao;", "data_debug"})
@dagger.Module
public final class RoomDBModule {
    @org.jetbrains.annotations.NotNull
    public static final com.mohamed.data.di.RoomDBModule INSTANCE = null;
    
    private RoomDBModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mohamed.data.source.local.NewsDatabase provideRoomDB(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mohamed.data.source.local.NewsDao provideNewsDAO(@org.jetbrains.annotations.NotNull
    com.mohamed.data.source.local.NewsDatabase productsRoomDB) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mohamed.data.source.local.SearchKeyDao provideSearchDAO(@org.jetbrains.annotations.NotNull
    com.mohamed.data.source.local.NewsDatabase productsRoomDB) {
        return null;
    }
}