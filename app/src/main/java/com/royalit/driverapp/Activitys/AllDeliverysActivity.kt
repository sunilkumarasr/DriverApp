package com.royalit.driverapp.Activitys

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.royalit.driverapp.Config.ViewController
import com.royalit.driverapp.R
import com.royalit.driverapp.databinding.ActivityAboutUsBinding
import com.royalit.driverapp.databinding.ActivityAllDeliverysBinding

class AllDeliverysActivity : AppCompatActivity() {

    val binding: ActivityAllDeliverysBinding by lazy {
        ActivityAllDeliverysBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        ViewController.changeStatusBarColor(this, ContextCompat.getColor(this, R.color.loginBg), false)

        inits()

    }

    private fun inits() {
        binding.root.findViewById<TextView>(R.id.txtTitle).text = "All Deliveries"
        binding.root.findViewById<ImageView>(R.id.imgBack).setOnClickListener { finish() }

        if(!ViewController.noInterNetConnectivity(applicationContext)){
            ViewController.showToast(applicationContext, "Please check your connection ")
        }else{
            //aboutUsApi()
        }

        binding.linearViewDetails.setOnClickListener {
            startActivity(Intent(this@AllDeliverysActivity, OrderDetailsActivity::class.java))
        }


    }

}