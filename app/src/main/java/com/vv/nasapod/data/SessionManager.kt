package com.vv.nasapod.data

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences


class SessionManager @SuppressLint("CommitPrefEdits")
constructor(context: Context) {
    private val pref: SharedPreferences
    private val editor: SharedPreferences.Editor

    init {
        pref = context.getSharedPreferences(PREF_NAME, 0)
        editor = pref.edit()
    }

    var isFirstUse: Boolean
        get() = pref.getBoolean(IS_FIRST_USE, true)
        set(value) {
            pref.edit().putBoolean(IS_FIRST_USE,value).apply()
        }


    companion object {
        private const val PREF_NAME = "NasaAndroidPref"
        private const val IS_FIRST_USE = "IsFirstUse"
    }
}