package com.mohamed.data.repositeries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/mohamed/data/repositeries/AppPreferencesImp;", "Lcom/mohamed/domain/repositories/ISharedPrefrance;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPref", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getLang", "", "setLang", "", "lang", "data_debug"})
public final class AppPreferencesImp implements com.mohamed.domain.repositories.ISharedPrefrance {
    private final android.content.SharedPreferences sharedPref = null;
    
    @javax.inject.Inject
    public AppPreferencesImp(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getLang() {
        return null;
    }
    
    @java.lang.Override
    public void setLang(@org.jetbrains.annotations.NotNull
    java.lang.String lang) {
    }
}