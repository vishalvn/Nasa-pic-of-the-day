package com.vv.nasapod.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/vv/nasapod/di/MainComponent;", "", "injectApodScreen", "", "nasaAPODScreen", "Lcom/vv/nasapod/ui/npod/NasaPODScreen;", "injectPhotoScreen", "photoViewScreen", "Lcom/vv/nasapod/ui/PhotoViewScreen;", "injectVideoScreen", "videoViewScreen", "Lcom/vv/nasapod/ui/VideoViewScreen;", "Builder", "app_debug"})
@dagger.Component(modules = {com.vv.nasapod.di.module.ApplicationModule.class, com.vv.nasapod.di.module.NetworkModule.class, com.vv.nasapod.di.module.PicassoModule.class, com.vv.nasapod.di.module.RetrofitModule.class})
@AppScope()
public abstract interface MainComponent {
    
    public abstract void injectApodScreen(@org.jetbrains.annotations.NotNull()
    com.vv.nasapod.ui.npod.NasaPODScreen nasaAPODScreen);
    
    public abstract void injectPhotoScreen(@org.jetbrains.annotations.NotNull()
    com.vv.nasapod.ui.PhotoViewScreen photoViewScreen);
    
    public abstract void injectVideoScreen(@org.jetbrains.annotations.NotNull()
    com.vv.nasapod.ui.VideoViewScreen videoViewScreen);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/vv/nasapod/di/MainComponent$Builder;", "", "build", "Lcom/vv/nasapod/di/MainComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vv.nasapod.di.MainComponent build();
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.vv.nasapod.di.MainComponent.Builder context(@org.jetbrains.annotations.NotNull()
        @ApplicationContext()
        android.content.Context context);
    }
}