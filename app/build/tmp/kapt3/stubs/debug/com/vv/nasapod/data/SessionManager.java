package com.vv.nasapod.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/vv/nasapod/data/SessionManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "value", "", "isFirstUse", "()Z", "setFirstUse", "(Z)V", "pref", "Landroid/content/SharedPreferences;", "Companion", "app_debug"})
public final class SessionManager {
    private final android.content.SharedPreferences pref = null;
    private final android.content.SharedPreferences.Editor editor = null;
    private static final java.lang.String PREF_NAME = "NasaAndroidPref";
    private static final java.lang.String IS_FIRST_USE = "IsFirstUse";
    public static final com.vv.nasapod.data.SessionManager.Companion Companion = null;
    
    public final boolean isFirstUse() {
        return false;
    }
    
    public final void setFirstUse(boolean value) {
    }
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public SessionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/vv/nasapod/data/SessionManager$Companion;", "", "()V", "IS_FIRST_USE", "", "PREF_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}