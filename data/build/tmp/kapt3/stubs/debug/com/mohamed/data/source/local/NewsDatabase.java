package com.mohamed.data.source.local;

import java.lang.System;

@androidx.room.Database(entities = {com.mohamed.domain.entity.NewsDto.class, com.mohamed.data.entity.SearchNews.class, com.mohamed.data.entity.SearchKey.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/mohamed/data/source/local/NewsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "newsDao", "Lcom/mohamed/data/source/local/NewsDao;", "searchQueryRemoteKeyDao", "Lcom/mohamed/data/source/local/SearchKeyDao;", "data_debug"})
public abstract class NewsDatabase extends androidx.room.RoomDatabase {
    
    public NewsDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.mohamed.data.source.local.NewsDao newsDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.mohamed.data.source.local.SearchKeyDao searchQueryRemoteKeyDao();
}