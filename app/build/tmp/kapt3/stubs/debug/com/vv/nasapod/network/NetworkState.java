package com.vv.nasapod.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/vv/nasapod/network/NetworkState;", "T", "", "()V", "Error", "Loading", "NetworkError", "Success", "Lcom/vv/nasapod/network/NetworkState$Loading;", "Lcom/vv/nasapod/network/NetworkState$NetworkError;", "Lcom/vv/nasapod/network/NetworkState$Error;", "Lcom/vv/nasapod/network/NetworkState$Success;", "app_debug"})
public abstract class NetworkState<T extends java.lang.Object> {
    
    private NetworkState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/vv/nasapod/network/NetworkState$Loading;", "Lcom/vv/nasapod/network/NetworkState;", "", "()V", "app_debug"})
    public static final class Loading extends com.vv.nasapod.network.NetworkState {
        public static final com.vv.nasapod.network.NetworkState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/vv/nasapod/network/NetworkState$NetworkError;", "Lcom/vv/nasapod/network/NetworkState;", "", "()V", "app_debug"})
    public static final class NetworkError extends com.vv.nasapod.network.NetworkState {
        public static final com.vv.nasapod.network.NetworkState.NetworkError INSTANCE = null;
        
        private NetworkError() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004H\u00c6\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/vv/nasapod/network/NetworkState$Error;", "T", "Lcom/vv/nasapod/network/NetworkState;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends com.vv.nasapod.network.NetworkState<T> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vv.nasapod.network.NetworkState.Error<T> copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/vv/nasapod/network/NetworkState$Success;", "T", "Lcom/vv/nasapod/network/NetworkState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/vv/nasapod/network/NetworkState$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.vv.nasapod.network.NetworkState<T> {
        @org.jetbrains.annotations.Nullable()
        private final T data = null;
        
        @org.jetbrains.annotations.Nullable()
        public final T getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.Nullable()
        T data) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vv.nasapod.network.NetworkState.Success<T> copy(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}