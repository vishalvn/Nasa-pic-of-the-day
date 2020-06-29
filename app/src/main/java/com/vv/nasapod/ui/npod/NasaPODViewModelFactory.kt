package com.vv.nasapod.ui.npod

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class NasaPODViewModelFactory @Inject constructor(
    private val nasaAPODRepository: NasaPODRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NasaPODViewModel(
            nasaAPODRepository
        ) as T
    }
}