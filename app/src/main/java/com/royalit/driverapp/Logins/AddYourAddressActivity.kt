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
import com.royalit.driverapp.databinding.ActivityAddYourAddressBinding
import com.royalit.driverapp.databinding.ActivityPersonalInformationBinding

class AddYourAddressActivity : AppCompatActivity() {

    val binding: ActivityAddYourAddressBinding by lazy {
        ActivityAddYourAddressBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        ViewController.changeStatusBarColor(this, ContextCompat.getColor(this, R.color.loginBg), false)

        inits()

    }

    private fun inits() {
        binding.linearVerify.setOnClickListener {
            startActivity(Intent(this@AddYourAddressActivity, AddYourProfilePicActivity::class.java))
            overridePendingTransition(0, 0)
        }

    }

}