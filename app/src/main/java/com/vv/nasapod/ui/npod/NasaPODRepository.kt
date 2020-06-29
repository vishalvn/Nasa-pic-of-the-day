package com.vv.nasapod.ui.npod

import com.vv.nasapod.data.model.Npod
import com.vv.nasapod.network.NasaApiInterface
import com.vv.nasapod.util.API_KEY
import io.reactivex.Single
import javax.inject.Inject

class NasaPODRepository @Inject constructor(
    private val nasaApiInterface: NasaApiInterface
) {

    fun getNpod(date : String?) : Single<Npod> = nasaApiInterface.getApod(API_KEY,date ?: "2019-01-01")

    fun getDefaultNpod() : Single<Npod> = nasaApiInterface.getDefaultApod(API_KEY)
}