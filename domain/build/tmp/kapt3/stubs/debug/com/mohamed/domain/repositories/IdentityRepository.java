package com.mohamed.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/mohamed/domain/repositories/IdentityRepository;", "", "changePassword", "Lcom/mohamed/domain/util/Resource;", "", "changePasswordRequest", "Lcom/mohamed/domain/entity/ChangePasswordRequest;", "(Lcom/mohamed/domain/entity/ChangePasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/mohamed/domain/entity/AuthorizationData;", "loginRequest", "Lcom/mohamed/domain/entity/LoginRequest;", "(Lcom/mohamed/domain/entity/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "refreshTokenRequest", "Lcom/mohamed/domain/entity/RefreshTokenRequest;", "(Lcom/mohamed/domain/entity/RefreshTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface IdentityRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull
    com.mohamed.domain.entity.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<com.mohamed.domain.entity.AuthorizationData>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object refreshToken(@org.jetbrains.annotations.NotNull
    com.mohamed.domain.entity.RefreshTokenRequest refreshTokenRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<com.mohamed.domain.entity.AuthorizationData>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object changePassword(@org.jetbrains.annotations.NotNull
    com.mohamed.domain.entity.ChangePasswordRequest changePasswordRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<java.lang.Boolean>> continuation);
}