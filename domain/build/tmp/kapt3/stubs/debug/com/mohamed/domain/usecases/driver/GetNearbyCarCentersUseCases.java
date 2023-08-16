package com.mohamed.domain.usecases.driver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/mohamed/domain/usecases/driver/GetNearbyCarCentersUseCases;", "", "driverRepository", "Lcom/mohamed/domain/repositories/WorkerRepository;", "(Lcom/mohamed/domain/repositories/WorkerRepository;)V", "invoke", "Lcom/mohamed/domain/util/Resource;", "", "Lcom/mohamed/domain/model/CarService;", "nearbyParams", "Lcom/mohamed/domain/entity/NearbyParams;", "(Lcom/mohamed/domain/entity/NearbyParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class GetNearbyCarCentersUseCases {
    private final com.mohamed.domain.repositories.WorkerRepository driverRepository = null;
    
    @javax.inject.Inject
    public GetNearbyCarCentersUseCases(@org.jetbrains.annotations.NotNull
    com.mohamed.domain.repositories.WorkerRepository driverRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    com.mohamed.domain.entity.NearbyParams nearbyParams, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<? extends java.util.List<com.mohamed.domain.model.CarService>>> continuation) {
        return null;
    }
}