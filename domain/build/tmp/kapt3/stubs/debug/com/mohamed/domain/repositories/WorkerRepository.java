package com.mohamed.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u000b\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J-\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00110\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00110\u00032\u0006\u0010\u0019\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/mohamed/domain/repositories/WorkerRepository;", "", "addServiceForSpecific", "Lcom/mohamed/domain/util/Resource;", "", "addServiceToVechical", "Lcom/mohamed/domain/entity/RequestServiceToVechical;", "(Lcom/mohamed/domain/entity/RequestServiceToVechical;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteServiceFromVisit", "serviceId", "", "visitId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetailForVisit", "Lcom/mohamed/domain/model/VehicalInformation;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getServiceCategory", "", "Lcom/mohamed/domain/model/ServiceCategory;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getServiceTpeForCar", "Lcom/mohamed/domain/model/ServiceTypeCategory;", "categoryId", "getVehicalScanedByWorker", "Lcom/mohamed/domain/model/VehicleVisited;", "ongoing", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scanCode", "requestScanNFC", "Lcom/mohamed/domain/entity/RequestScanNFC;", "(Lcom/mohamed/domain/entity/RequestScanNFC;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateServiceForSpecific", "domain_debug"})
public abstract interface WorkerRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object scanCode(@org.jetbrains.annotations.NotNull
    com.mohamed.domain.entity.RequestScanNFC requestScanNFC, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<java.lang.Boolean>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getVehicalScanedByWorker(boolean ongoing, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<? extends java.util.List<com.mohamed.domain.model.VehicleVisited>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDetailForVisit(int visitId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<com.mohamed.domain.model.VehicalInformation>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getServiceTpeForCar(int visitId, int categoryId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<? extends java.util.List<com.mohamed.domain.model.ServiceTypeCategory>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getServiceCategory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<? extends java.util.List<com.mohamed.domain.model.ServiceCategory>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addServiceForSpecific(@org.jetbrains.annotations.NotNull
    com.mohamed.domain.entity.RequestServiceToVechical addServiceToVechical, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<java.lang.Boolean>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateServiceForSpecific(@org.jetbrains.annotations.NotNull
    com.mohamed.domain.entity.RequestServiceToVechical addServiceToVechical, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<java.lang.Boolean>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteServiceFromVisit(int serviceId, int visitId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mohamed.domain.util.Resource<java.lang.Boolean>> continuation);
}