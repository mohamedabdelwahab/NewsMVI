package com.mohamed.data.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "search_news", primaryKeys = {"searchQuery", "newsUrl"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/mohamed/data/entity/SearchNews;", "", "searchQuery", "", "newsUrl", "sort", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getNewsUrl", "()Ljava/lang/String;", "getSearchQuery", "getSort", "()I", "data_debug"})
public final class SearchNews {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String searchQuery = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String newsUrl = null;
    private final int sort = 0;
    
    public SearchNews(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    java.lang.String newsUrl, int sort) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNewsUrl() {
        return null;
    }
    
    public final int getSort() {
        return 0;
    }
}