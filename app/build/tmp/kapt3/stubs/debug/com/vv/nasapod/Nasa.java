package com.vv.nasapod;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/vv/nasapod/Nasa;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/vv/nasapod/di/MainComponent;", "getAppComponent", "()Lcom/vv/nasapod/di/MainComponent;", "setAppComponent", "(Lcom/vv/nasapod/di/MainComponent;)V", "getComponent", "onCreate", "", "Companion", "app_debug"})
public final class Nasa extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public com.vv.nasapod.di.MainComponent appComponent;
    public static final com.vv.nasapod.Nasa.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vv.nasapod.di.MainComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull()
    com.vv.nasapod.di.MainComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final com.vv.nasapod.di.MainComponent getComponent() {
        return null;
    }
    
    public Nasa() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vv/nasapod/Nasa$Companion;", "", "()V", "getApp", "Lcom/vv/nasapod/Nasa;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vv.nasapod.Nasa getApp(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}