package com.vv.nasapod.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017\u00a8\u0006\t"}, d2 = {"Lcom/vv/nasapod/di/module/RetrofitModule;", "", "()V", "retrofit", "Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "gson", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.Module(includes = {com.vv.nasapod.di.module.NetworkModule.class})
public class RetrofitModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.vv.nasapod.di.AppScope()
    @dagger.Provides()
    public retrofit2.Retrofit retrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    public RetrofitModule() {
        super();
    }
}