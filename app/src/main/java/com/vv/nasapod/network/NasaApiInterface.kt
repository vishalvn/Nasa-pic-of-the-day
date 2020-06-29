package com.vv.nasapod.network

import com.vv.nasapod.data.model.Npod
import com.vv.nasapod.util.APOD_ENDPOINT
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface NasaApiInterface {

    @GET(APOD_ENDPOINT)
    fun getDefaultApod(
        @Query("api_key") apiKey: String
    ): Single<Npod>

    @GET(APOD_ENDPOINT)
    fun getApod(
        @Query("api_key") apiKey: String,
        @Query("date") date: String
    ): Single<Npod>

}