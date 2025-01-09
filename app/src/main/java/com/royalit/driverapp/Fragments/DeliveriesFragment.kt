package com.royalit.driverapp.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.royalit.driverapp.Activitys.MyAccountActivity
import com.royalit.driverapp.Activitys.OrderDetailsActivity
import com.royalit.driverapp.R
import com.royalit.driverapp.databinding.FragmentDeliveriesBinding
import com.royalit.driverapp.databinding.FragmentHomeBinding

class DeliveriesFragment : Fragment() {

    private lateinit var binding: FragmentDeliveriesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDeliveriesBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

    }

    private fun init() {

        binding.linearViewDetails.setOnClickListener {
            startActivity(Intent(requireActivity(), OrderDetailsActivity::class.java))
        }

    }

}