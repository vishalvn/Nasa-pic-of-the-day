package com.vv.nasapod.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002J\u0012\u0010-\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020$H\u0016J\u001a\u00101\u001a\u00020$2\u0006\u00102\u001a\u0002032\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00104\u001a\u00020$H\u0002J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020&H\u0002J\b\u00107\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/vv/nasapod/ui/VideoViewScreen;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/vv/nasapod/databinding/ScreenVideoViewBinding;", "nasaAPODViewModel", "Lcom/vv/nasapod/ui/npod/NasaPODViewModel;", "getNasaAPODViewModel", "()Lcom/vv/nasapod/ui/npod/NasaPODViewModel;", "nasaAPODViewModel$delegate", "Lkotlin/Lazy;", "nasaAPODViewModelFactory", "Lcom/vv/nasapod/ui/npod/NasaPODViewModelFactory;", "getNasaAPODViewModelFactory", "()Lcom/vv/nasapod/ui/npod/NasaPODViewModelFactory;", "setNasaAPODViewModelFactory", "(Lcom/vv/nasapod/ui/npod/NasaPODViewModelFactory;)V", "picasso", "Lcom/squareup/picasso/Picasso;", "getPicasso", "()Lcom/squareup/picasso/Picasso;", "setPicasso", "(Lcom/squareup/picasso/Picasso;)V", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "playerEventListener", "Lcom/google/android/exoplayer2/Player$EventListener;", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "videoLoadDisposable", "Lio/reactivex/disposables/Disposable;", "buildMediaSource", "Lcom/google/android/exoplayer2/source/MediaSource;", "uri", "Landroid/net/Uri;", "extractYouTubeUrl", "", "it", "", "getYoutubeLink", "url", "hideSnackBar", "insetWindow", "makeSnackBar", "makeVideoPlayer", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "releasePlayer", "showSnackBar", "text", "subscribeToUrl", "app_debug"})
public final class VideoViewScreen extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.vv.nasapod.ui.npod.NasaPODViewModelFactory nasaAPODViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.squareup.picasso.Picasso picasso;
    private com.vv.nasapod.databinding.ScreenVideoViewBinding binding;
    private io.reactivex.disposables.Disposable videoLoadDisposable;
    private final kotlin.Lazy nasaAPODViewModel$delegate = null;
    private com.google.android.exoplayer2.SimpleExoPlayer player;
    private com.google.android.material.snackbar.Snackbar snackbar;
    private final com.google.android.exoplayer2.Player.EventListener playerEventListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vv.nasapod.ui.npod.NasaPODViewModelFactory getNasaAPODViewModelFactory() {
        return null;
    }
    
    public final void setNasaAPODViewModelFactory(@org.jetbrains.annotations.NotNull()
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
    
    private final void subscribeToUrl() {
    }
    
    private final void extractYouTubeUrl(java.lang.String it) {
    }
    
    private final void makeSnackBar() {
    }
    
    private final void showSnackBar(java.lang.String text) {
    }
    
    private final void hideSnackBar() {
    }
    
    private final com.google.android.exoplayer2.source.MediaSource buildMediaSource(android.net.Uri uri) {
        return null;
    }
    
    private final void makeVideoPlayer() {
    }
    
    private final java.lang.String getYoutubeLink(java.lang.String url) {
        return null;
    }
    
    private final void insetWindow() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void releasePlayer() {
    }
    
    public VideoViewScreen() {
        super();
    }
}