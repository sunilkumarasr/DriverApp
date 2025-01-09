package com.royalit.driverapp.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.royalit.driverapp.Activitys.AllDeliverysActivity
import com.royalit.driverapp.Activitys.MarkToDeliveryActivity
import com.royalit.driverapp.Activitys.OnGoingDeliveryActivity
import com.royalit.driverapp.R
import com.royalit.driverapp.databinding.FragmentHomeBinding
import com.royalit.driverapp.databinding.FragmentSupportBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

    }

    private fun init() {

        binding.linearViewAllDeliveries.setOnClickListener {
            startActivity(Intent(requireActivity(), AllDeliverysActivity::class.java))
        }

        binding.linearViewActiveDelivery.setOnClickListener {
            startActivity(Intent(requireActivity(), OnGoingDeliveryActivity::class.java))
        }

    }

}