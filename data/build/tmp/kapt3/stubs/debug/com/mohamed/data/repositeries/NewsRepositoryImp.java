package com.mohamed.data.repositeries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/mohamed/data/repositeries/NewsRepositoryImp;", "Lcom/mohamed/domain/repositories/NewsRepository;", "newsApi", "Lcom/mohamed/data/source/remote/NewsService;", "newsArticleDb", "Lcom/mohamed/data/source/local/NewsDatabase;", "iSharedPrefrance", "Lcom/mohamed/domain/repositories/ISharedPrefrance;", "(Lcom/mohamed/data/source/remote/NewsService;Lcom/mohamed/data/source/local/NewsDatabase;Lcom/mohamed/domain/repositories/ISharedPrefrance;)V", "newsArticleDao", "Lcom/mohamed/data/source/local/NewsDao;", "getSearchResultsPaged", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/mohamed/domain/entity/NewsDto;", "query", "", "refreshOnInit", "", "data_debug"})
public final class NewsRepositoryImp implements com.mohamed.domain.repositories.NewsRepository {
    private final com.mohamed.data.source.remote.NewsService newsApi = null;
    private final com.mohamed.data.source.local.NewsDatabase newsArticleDb = null;
    private final com.mohamed.domain.repositories.ISharedPrefrance iSharedPrefrance = null;
    private final com.mohamed.data.source.local.NewsDao newsArticleDao = null;
    
    @javax.inject.Inject
    public NewsRepositoryImp(@org.jetbrains.annotations.NotNull
    com.mohamed.data.source.remote.NewsService newsApi, @org.jetbrains.annotations.NotNull
    com.mohamed.data.source.local.NewsDatabase newsArticleDb, @org.jetbrains.annotations.NotNull
    com.mohamed.domain.repositories.ISharedPrefrance iSharedPrefrance) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.mohamed.domain.entity.NewsDto>> getSearchResultsPaged(@org.jetbrains.annotations.NotNull
    java.lang.String query, boolean refreshOnInit) {
        return null;
    }
}