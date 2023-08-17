package com.mohamed.data.source.remote;

import java.lang.System;

@androidx.paging.ExperimentalPagingApi
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u0011\u001a\u00020\u0012H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J-\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0019H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/mohamed/data/source/remote/SearchNewsRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/mohamed/domain/entity/NewsDto;", "searchQuery", "", "newsApi", "Lcom/mohamed/data/source/remote/NewsService;", "newsArticleDb", "Lcom/mohamed/data/source/local/NewsDatabase;", "refreshOnInit", "", "(Ljava/lang/String;Lcom/mohamed/data/source/remote/NewsService;Lcom/mohamed/data/source/local/NewsDatabase;Z)V", "newsArticleDao", "Lcom/mohamed/data/source/local/NewsDao;", "searchQueryRemoteKeyDao", "Lcom/mohamed/data/source/local/SearchKeyDao;", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class SearchNewsRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, com.mohamed.domain.entity.NewsDto> {
    private final java.lang.String searchQuery = null;
    private final com.mohamed.data.source.remote.NewsService newsApi = null;
    private final com.mohamed.data.source.local.NewsDatabase newsArticleDb = null;
    private final boolean refreshOnInit = false;
    private final com.mohamed.data.source.local.NewsDao newsArticleDao = null;
    private final com.mohamed.data.source.local.SearchKeyDao searchQueryRemoteKeyDao = null;
    
    public SearchNewsRemoteMediator(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    com.mohamed.data.source.remote.NewsService newsApi, @org.jetbrains.annotations.NotNull
    com.mohamed.data.source.local.NewsDatabase newsArticleDb, boolean refreshOnInit) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.paging.ExperimentalPagingApi
    @java.lang.Override
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, com.mohamed.domain.entity.NewsDto> state, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.paging.ExperimentalPagingApi
    @java.lang.Override
    public java.lang.Object initialize(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.InitializeAction> continuation) {
        return null;
    }
}