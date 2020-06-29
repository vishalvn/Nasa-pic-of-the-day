package com.vv.nasapod.di.module

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.vv.nasapod.data.SessionManager
import com.vv.nasapod.di.AppScope
import com.vv.nasapod.di.ApplicationContext
import com.vv.nasapod.network.NasaApiInterface
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module()
class ApplicationModule {

    @Provides
    @AppScope
    fun newsApiServices(retrofit: Retrofit): NasaApiInterface {
        return retrofit.create(NasaApiInterface::class.java)
    }

    @Provides
    @AppScope
    fun gson(): Gson {
        val gsonBuilder = GsonBuilder()
            .setDateFormat("yyyy-MM-dd")
        return gsonBuilder.create()
    }

    @Provides
    @AppScope
    fun sessionManager(@ApplicationContext context: Context): SessionManager {
        return SessionManager(context)
    }
}