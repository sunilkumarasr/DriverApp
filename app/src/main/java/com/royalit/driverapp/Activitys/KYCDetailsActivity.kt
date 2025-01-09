package com.royalit.driverapp.Activitys

import android.os.Bundle
import android.widget.ImageView
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
import com.royalit.driverapp.databinding.ActivityKycdetailsBinding

class KYCDetailsActivity : AppCompatActivity() {

    val binding: ActivityKycdetailsBinding by lazy {
        ActivityKycdetailsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        ViewController.changeStatusBarColor(this, ContextCompat.getColor(this, R.color.colorPrimary), false)

        inits()

    }

    private fun inits() {
        binding.root.findViewById<TextView>(R.id.txtTitle).text = "KYC Details"
        binding.root.findViewById<ImageView>(R.id.imgBack).setOnClickListener { finish() }

        if(!ViewController.noInterNetConnectivity(applicationContext)){
            ViewController.showToast(applicationContext, "Please check your connection ")
        }else{
            //kycDetailsApi()
        }

        binding.imgEditVehicle.setOnClickListener {
            EditVehicleDialog()
        }

    }

    private fun EditVehicleDialog() {
        val bottomSheetDialog = BottomSheetDialog(this@KYCDetailsActivity)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_editvehicle, null)
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