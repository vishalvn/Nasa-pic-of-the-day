package com.vv.nasapod.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import androidx.lifecycle.Observer
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import com.vv.nasapod.R
import com.vv.nasapod.databinding.ScreenPhotoViewBinding
import com.vv.nasapod.getAppComponent
import com.vv.nasapod.ui.npod.NasaPODViewModel
import com.vv.nasapod.ui.npod.NasaPODViewModelFactory
import javax.inject.Inject

class PhotoViewScreen : Fragment(R.layout.screen_photo_view) {

    @Inject
    lateinit var nasaPODViewModelFactory: NasaPODViewModelFactory
    @Inject
    lateinit var picasso: Picasso
    private lateinit var binding: ScreenPhotoViewBinding
    private val nasaAPODViewModel: NasaPODViewModel by navGraphViewModels(R.id.nav_main) { nasaPODViewModelFactory }
    private lateinit var snackbar: Snackbar

    override fun onCreate(savedInstanceState: Bundle?) {
        getAppComponent().injectPhotoScreen(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ScreenPhotoViewBinding.bind(view)
        insetWindow()
        nasaAPODViewModel.hdUrl.observe(this.viewLifecycleOwner, Observer {
            if (it != null) {
                picasso.load(it)
                    .resize(1080,1080)
                    .onlyScaleDown()
                    .into(binding.zoomView, imageLoadCallBack)
            }
        })
    }

    private val imageLoadCallBack: Callback = object : Callback {
        override fun onSuccess() {
            binding.progressBar.visibility = View.GONE
        }

        override fun onError(e: Exception?) {
            Log.e("Error loading APOD",e.toString())
            binding.progressBar.visibility = View.GONE
//            showSnackBar(getString(R.string.error_loading_image))
        }
    }

    private fun insetWindow() {
        binding.root.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)
    }


}