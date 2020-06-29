package com.vv.nasapod.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/vv/nasapod/ui/PhotoViewScreen;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/vv/nasapod/databinding/ScreenPhotoViewBinding;", "imageLoadCallBack", "Lcom/squareup/picasso/Callback;", "nasaAPODViewModel", "Lcom/vv/nasapod/ui/npod/NasaPODViewModel;", "getNasaAPODViewModel", "()Lcom/vv/nasapod/ui/npod/NasaPODViewModel;", "nasaAPODViewModel$delegate", "Lkotlin/Lazy;", "nasaPODViewModelFactory", "Lcom/vv/nasapod/ui/npod/NasaPODViewModelFactory;", "getNasaPODViewModelFactory", "()Lcom/vv/nasapod/ui/npod/NasaPODViewModelFactory;", "setNasaPODViewModelFactory", "(Lcom/vv/nasapod/ui/npod/NasaPODViewModelFactory;)V", "picasso", "Lcom/squareup/picasso/Picasso;", "getPicasso", "()Lcom/squareup/picasso/Picasso;", "setPicasso", "(Lcom/squareup/picasso/Picasso;)V", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "insetWindow", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "app_debug"})
public final class PhotoViewScreen extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.vv.nasapod.ui.npod.NasaPODViewModelFactory nasaPODViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.squareup.picasso.Picasso picasso;
    private com.vv.nasapod.databinding.ScreenPhotoViewBinding binding;
    private final kotlin.Lazy nasaAPODViewModel$delegate = null;
    private com.google.android.material.snackbar.Snackbar snackbar;
    private final com.squareup.picasso.Callback imageLoadCallBack = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vv.nasapod.ui.npod.NasaPODViewModelFactory getNasaPODViewModelFactory() {
        return null;
    }
    
    public final void setNasaPODViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.vv.nasapod.ui.npod.NasaPODViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.picasso.Picasso getPicasso() {
        return null;
    }
    
    public final void setPicasso(@org.jetbrains.annotations.NotNull()
    com.squareup.picasso.Picasso p0) {
    }
    
    private final com.vv.nasapod.ui.npod.NasaPODViewModel getNasaAPODViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void insetWindow() {
    }
    
    public PhotoViewScreen() {
        super();
    }
}