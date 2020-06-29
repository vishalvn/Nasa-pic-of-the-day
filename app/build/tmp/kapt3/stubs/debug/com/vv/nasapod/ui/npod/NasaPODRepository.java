package com.vv.nasapod.ui.npod;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/vv/nasapod/ui/npod/NasaPODRepository;", "", "nasaApiInterface", "Lcom/vv/nasapod/network/NasaApiInterface;", "(Lcom/vv/nasapod/network/NasaApiInterface;)V", "getDefaultNpod", "Lio/reactivex/Single;", "Lcom/vv/nasapod/data/model/Npod;", "getNpod", "date", "", "app_debug"})
public final class NasaPODRepository {
    private final com.vv.nasapod.network.NasaApiInterface nasaApiInterface = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.vv.nasapod.data.model.Npod> getNpod(@org.jetbrains.annotations.Nullable()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.vv.nasapod.data.model.Npod> getDefaultNpod() {
        return null;
    }
    
    @javax.inject.Inject()
    public NasaPODRepository(@org.jetbrains.annotations.NotNull()
    com.vv.nasapod.network.NasaApiInterface nasaApiInterface) {
        super();
    }
}