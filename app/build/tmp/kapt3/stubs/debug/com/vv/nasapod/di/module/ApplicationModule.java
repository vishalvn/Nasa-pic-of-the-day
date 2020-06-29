package com.vv.nasapod.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/vv/nasapod/di/module/ApplicationModule;", "", "()V", "gson", "Lcom/google/gson/Gson;", "newsApiServices", "Lcom/vv/nasapod/network/NasaApiInterface;", "retrofit", "Lretrofit2/Retrofit;", "sessionManager", "Lcom/vv/nasapod/data/SessionManager;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.vv.nasapod.di.AppScope()
    @dagger.Provides()
    public final com.vv.nasapod.network.NasaApiInterface newsApiServices(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.vv.nasapod.di.AppScope()
    @dagger.Provides()
    public final com.google.gson.Gson gson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.vv.nasapod.di.AppScope()
    @dagger.Provides()
    public final com.vv.nasapod.data.SessionManager sessionManager(@org.jetbrains.annotations.NotNull()
    @com.vv.nasapod.di.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    public ApplicationModule() {
        super();
    }
}