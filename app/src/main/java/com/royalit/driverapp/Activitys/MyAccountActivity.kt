package com.royalit.driverapp.Activitys

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.royalit.driverapp.Config.ViewController
import com.royalit.driverapp.R
import com.royalit.driverapp.databinding.ActivityAboutUsBinding
import com.royalit.driverapp.databinding.ActivityMyAccountBinding

class MyAccountActivity : AppCompatActivity() {

    val binding: ActivityMyAccountBinding by lazy {
        ActivityMyAccountBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        ViewController.changeStatusBarColor(this, ContextCompat.getColor(this, R.color.colorPrimary), false)

        inits()

    }

    private fun inits() {
        binding.root.findViewById<TextView>(R.id.txtTitle).text = "My Account"
        binding.root.findViewById<ImageView>(R.id.imgBack).setOnClickListener { finish() }

        if(!ViewController.noInterNetConnectivity(applicationContext)){
            ViewController.showToast(applicationContext, "Please check your connection ")
        }else{
            //myAccountApi()
        }

        binding.imgAddressEdit.setOnClickListener {
            AddressDialog()
        }

        binding.imgEditProfile.setOnClickListener {
           ProfileDialog()
        }

    }

    private fun AddressDialog() {
        val bottomSheetDialog = BottomSheetDialog(this@MyAccountActivity)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_editaddress, null)
        bottomSheetDialog.setContentView(view)
        val linearCancel = view.findViewById<TextView>(R.id.linearCancel)
        val linearUpload = view.findViewById<TextView>(R.id.linearUpload)
        linearCancel.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        linearUpload.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        bottomSheetDialog.show()
    }

    private fun ProfileDialog() {
        val bottomSheetDialog = BottomSheetDialog(this@MyAccountActivity)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_editprofile, null)
        bottomSheetDialog.setContentView(view)
        val linearCancel = view.findViewById<TextView>(R.id.linearCancel)
        val linearUpload = view.findViewById<TextView>(R.id.linearUpload)
        linearCancel.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        linearUpload.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        bottomSheetDialog.show()
    }

}