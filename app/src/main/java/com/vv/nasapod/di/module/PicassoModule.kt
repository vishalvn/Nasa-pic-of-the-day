package com.vv.nasapod.di.module

import android.content.Context

import com.squareup.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import com.vv.nasapod.di.AppScope
import com.vv.nasapod.di.ApplicationContext


import dagger.Module
import dagger.Provides


@Module(includes = [NetworkModule::class])
class PicassoModule {

    @Provides
    @AppScope
    fun picasso(@ApplicationContext context: Context): Picasso {
        return Picasso.Builder(context)
            .loggingEnabled(true)
            .downloader(OkHttp3Downloader(context))
            .build()
    }

}
