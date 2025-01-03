package com.royalit.driverapp.Activitys

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.royalit.driverapp.Config.Preferences
import com.royalit.driverapp.Config.ViewController
import com.royalit.driverapp.Fragments.DeliveriesFragment
import com.royalit.driverapp.Fragments.HomeFragment
import com.royalit.driverapp.Fragments.ProfileFragment
import com.royalit.driverapp.Fragments.SupportFragment
import com.royalit.driverapp.R
import com.royalit.driverapp.databinding.ActivityDashBoardBinding

class DashBoardActivity : AppCompatActivity() {

    val binding: ActivityDashBoardBinding by lazy {
        ActivityDashBoardBinding.inflate(layoutInflater)
    }

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        ViewController.changeStatusBarColor(
            this,
            ContextCompat.getColor(this, R.color.colorPrimary),
            false
        )

        //login
        Preferences.saveStringValue(applicationContext, Preferences.LOGINCHECK, "Login")


        inits()

    }

    private fun inits() {



        //BottomNavigationView
        loadFragment(HomeFragment())
        bottomNavigationView = binding.navigationView
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id. navigationHome-> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id. navigationDeliveries-> {
                    loadFragment(DeliveriesFragment())
                    true
                }
                R.id. navigationSupport-> {
                    loadFragment(SupportFragment())
                    true
                }
                R.id.navigationProfile -> {
                    loadFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contentFrame, fragment)
        transaction.commit()
    }

}