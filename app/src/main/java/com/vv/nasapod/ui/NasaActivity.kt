package com.vv.nasapod.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.vv.nasapod.R
import com.vv.nasapod.databinding.ActivityNasaBinding


class NasaActivity : AppCompatActivity() {

  private lateinit var binding: ActivityNasaBinding
  private lateinit var navController: NavController

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityNasaBinding.inflate(layoutInflater)
    setContentView(binding.root)
    init()
  }

  private fun init() {
    val navHostFragment: NavHostFragment =
      supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
    navController = navHostFragment.navController
  }

  override fun onNavigateUp(): Boolean {
    return navController.navigateUp() || super.onNavigateUp()
  }

}
