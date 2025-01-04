package com.royalit.driverapp.Logins

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.royalit.driverapp.Config.ViewController
import com.royalit.driverapp.R
import com.royalit.driverapp.databinding.ActivityDocsBinding
import com.royalit.driverapp.databinding.ActivityVehicleSelectionBinding

class VehicleSelectionActivity : AppCompatActivity() {

    val binding: ActivityVehicleSelectionBinding by lazy {
        ActivityVehicleSelectionBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        ViewController.changeStatusBarColor(this, ContextCompat.getColor(this, R.color.loginBg), false)

        inits()
    }


    private fun inits() {
        binding.linearContinue.setOnClickListener {
            startActivity(Intent(this@VehicleSelectionActivity, UploadDocActivity::class.java))
        }


    }

}