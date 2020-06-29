package com.vv.nasapod.di

import android.content.Context
import com.vv.nasapod.di.module.ApplicationModule
import com.vv.nasapod.di.module.NetworkModule
import com.vv.nasapod.di.module.PicassoModule
import com.vv.nasapod.di.module.RetrofitModule
import com.vv.nasapod.ui.PhotoViewScreen
import com.vv.nasapod.ui.VideoViewScreen
import com.vv.nasapod.ui.npod.NasaPODScreen
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(
    modules = [ApplicationModule::class, NetworkModule::class, PicassoModule::class, RetrofitModule::class]
)
interface MainComponent {
    fun injectApodScreen(nasaAPODScreen: NasaPODScreen)
    fun injectPhotoScreen(photoViewScreen: PhotoViewScreen)
    fun injectVideoScreen(videoViewScreen: VideoViewScreen)

    @Component.Builder
    interface Builder {
        fun build() : MainComponent
        @BindsInstance fun context(@ApplicationContext context : Context) : Builder
    }
}