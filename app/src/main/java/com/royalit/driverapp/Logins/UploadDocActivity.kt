package com.royalit.driverapp.Logins

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.royalit.driverapp.Config.ViewController
import com.royalit.driverapp.R
import com.royalit.driverapp.databinding.ActivityRegisterBinding
import com.royalit.driverapp.databinding.ActivityUploadDocBinding

class UploadDocActivity : AppCompatActivity() {

    val binding: ActivityUploadDocBinding by lazy {
        ActivityUploadDocBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        ViewController.changeStatusBarColor(this, ContextCompat.getColor(this, R.color.loginBg), false)

        inits()

    }

    private fun inits() {

        binding.imgBack.setOnClickListener {
            finish()
        }

        binding.linearAadharCard.setOnClickListener {
            AadharCardDialog()
        }
        binding.linearPanCard.setOnClickListener {
            PanCardDialog()
        }
        binding.linearDrivingLicense.setOnClickListener {
            DrivingLicenseDialog()
        }
        binding.linearVehicleRC.setOnClickListener {
            VehicleRCDialog()
        }

        binding.linearContinue.setOnClickListener {

        }


    }


    private fun AadharCardDialog() {
        val bottomSheetDialog = BottomSheetDialog(this@UploadDocActivity)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_aadharcard, null)
        bottomSheetDialog.setContentView(view)
        val linearCancel = view.findViewById<LinearLayout>(R.id.linearCancel)
        val linearUpload = view.findViewById<LinearLayout>(R.id.linearUpload)
        linearCancel.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        linearUpload.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        bottomSheetDialog.show()
    }

    private fun PanCardDialog() {
        val bottomSheetDialog = BottomSheetDialog(this@UploadDocActivity)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_pancard, null)
        bottomSheetDialog.setContentView(view)
        val linearCancel = view.findViewById<LinearLayout>(R.id.linearCancel)
        val linearUpload = view.findViewById<LinearLayout>(R.id.linearUpload)
        linearCancel.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        linearUpload.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        bottomSheetDialog.show()
    }

    private fun DrivingLicenseDialog() {
        val bottomSheetDialog = BottomSheetDialog(this@UploadDocActivity)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_driving, null)
        bottomSheetDialog.setContentView(view)
        val linearCancel = view.findViewById<LinearLayout>(R.id.linearCancel)
        val linearUpload = view.findViewById<LinearLayout>(R.id.linearUpload)
        linearCancel.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        linearUpload.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        bottomSheetDialog.show()
    }

    private fun VehicleRCDialog() {
        val bottomSheetDialog = BottomSheetDialog(this@UploadDocActivity)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_vehiclerc, null)
        bottomSheetDialog.setContentView(view)
        val linearCancel = view.findViewById<LinearLayout>(R.id.linearCancel)
        val linearUpload = view.findViewById<LinearLayout>(R.id.linearUpload)
        linearCancel.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        linearUpload.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        bottomSheetDialog.show()
    }

}