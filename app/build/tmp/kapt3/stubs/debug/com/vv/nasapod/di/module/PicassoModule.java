package com.vv.nasapod.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/vv/nasapod/di/module/PicassoModule;", "", "()V", "picasso", "Lcom/squareup/picasso/Picasso;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module(includes = {com.vv.nasapod.di.module.NetworkModule.class})
public final class PicassoModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.vv.nasapod.di.AppScope()
    @dagger.Provides()
    public final com.squareup.picasso.Picasso picasso(@org.jetbrains.annotations.NotNull()
    @com.vv.nasapod.di.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    public PicassoModule() {
        super();
    }
}