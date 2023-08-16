package com.mohamed.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007H&\u00a8\u0006\u0014"}, d2 = {"Lcom/mohamed/domain/repositories/ISharedPrefrance;", "", "getLang", "", "getRefreshToken", "getToken", "isLanguageSelected", "", "isOnboardingOpen", "saveOnboarding", "", "open", "saveRefreshToken", "refreshToken", "saveToken", "token", "setLang", "lang", "setLanguageSelected", "isSelected", "domain_debug"})
public abstract interface ISharedPrefrance {
    
    public abstract boolean isOnboardingOpen();
    
    public abstract void saveOnboarding(boolean open);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getLang();
    
    public abstract void setLang(@org.jetbrains.annotations.NotNull
    java.lang.String lang);
    
    public abstract void setLanguageSelected(boolean isSelected);
    
    public abstract boolean isLanguageSelected();
    
    public abstract void saveToken(@org.jetbrains.annotations.NotNull
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getToken();
    
    public abstract void saveRefreshToken(@org.jetbrains.annotations.NotNull
    java.lang.String refreshToken);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getRefreshToken();
}