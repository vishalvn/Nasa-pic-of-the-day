package com.vv.nasapod.ui.npod;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\u0018J\b\u0010)\u001a\u00020\'H\u0002J\b\u0010*\u001a\u00020\'H\u0014J\u0006\u0010+\u001a\u00020\'J\u001e\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00068F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/vv/nasapod/ui/npod/NasaPODViewModel;", "Landroidx/lifecycle/ViewModel;", "nasaAPODRepository", "Lcom/vv/nasapod/ui/npod/NasaPODRepository;", "(Lcom/vv/nasapod/ui/npod/NasaPODRepository;)V", "_apodData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/vv/nasapod/network/NetworkState;", "Lcom/vv/nasapod/data/model/Npod;", "_hdUrl", "", "_mediaType", "_selectedDate", "apodData", "Landroidx/lifecycle/LiveData;", "getApodData", "()Landroidx/lifecycle/LiveData;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "currentDateCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "decimalFormat", "Ljava/text/DecimalFormat;", "getDecimalFormat", "()Ljava/text/DecimalFormat;", "decimalFormat$delegate", "defaultDate", "hdUrl", "getHdUrl", "mediaType", "getMediaType", "()Landroidx/lifecycle/MutableLiveData;", "selectedDateCalenar", "getApodForDate", "", "getDate", "getDefaultApod", "onCleared", "reloadVideo", "setDate", "year", "", "month", "day", "app_debug"})
public final class NasaPODViewModel extends androidx.lifecycle.ViewModel {
    private final java.util.Calendar selectedDateCalenar = null;
    private final java.util.Calendar currentDateCalendar = null;
    private final kotlin.Lazy decimalFormat$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _hdUrl = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _mediaType = null;
    private final java.lang.String defaultDate = null;
    private final kotlin.Lazy compositeDisposable$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _selectedDate = null;
    private final androidx.lifecycle.MutableLiveData<com.vv.nasapod.network.NetworkState<com.vv.nasapod.data.model.Npod>> _apodData = null;
    private final com.vv.nasapod.ui.npod.NasaPODRepository nasaAPODRepository = null;
    
    private final java.text.DecimalFormat getDecimalFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getHdUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMediaType() {
        return null;
    }
    
    private final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.vv.nasapod.network.NetworkState<com.vv.nasapod.data.model.Npod>> getApodData() {
        return null;
    }
    
    private final void getDefaultApod() {
    }
    
    public final void getApodForDate() {
    }
    
    public final void setDate(int year, int month, int day) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getDate() {
        return null;
    }
    
    public final void reloadVideo() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public NasaPODViewModel(@org.jetbrains.annotations.NotNull()
    com.vv.nasapod.ui.npod.NasaPODRepository nasaAPODRepository) {
        super();
    }
}