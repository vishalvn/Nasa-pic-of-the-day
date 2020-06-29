package com.vv.nasapod.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/vv/nasapod/network/NasaApiInterface;", "", "getApod", "Lio/reactivex/Single;", "Lcom/vv/nasapod/data/model/Npod;", "apiKey", "", "date", "getDefaultApod", "app_debug"})
public abstract interface NasaApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "planetary/apod")
    public abstract io.reactivex.Single<com.vv.nasapod.data.model.Npod> getDefaultApod(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "planetary/apod")
    public abstract io.reactivex.Single<com.vv.nasapod.data.model.Npod> getApod(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date")
    java.lang.String date);
}