package com.mohamed.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/mohamed/data/network/HeaderInterceptor;", "Lokhttp3/Interceptor;", "iSharedPrefrance", "Lcom/mohamed/domain/repositories/ISharedPrefrance;", "(Lcom/mohamed/domain/repositories/ISharedPrefrance;)V", "getISharedPrefrance", "()Lcom/mohamed/domain/repositories/ISharedPrefrance;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "data_debug"})
@javax.inject.Singleton
public final class HeaderInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull
    private final com.mohamed.domain.repositories.ISharedPrefrance iSharedPrefrance = null;
    
    @javax.inject.Inject
    public HeaderInterceptor(@org.jetbrains.annotations.NotNull
    com.mohamed.domain.repositories.ISharedPrefrance iSharedPrefrance) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mohamed.domain.repositories.ISharedPrefrance getISharedPrefrance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}