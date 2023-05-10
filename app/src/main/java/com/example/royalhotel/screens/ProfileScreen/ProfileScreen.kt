package com.example.royalhotel.screens.ProfileScreen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.royalhotel.R
import com.example.royalhotel.databinding.FragmentProfileScreenBinding
import com.example.royalhotel.screens.LoginActivity
import com.example.royalhotel.screens.ManageRoomActivity

class ProfileScreen : Fragment(R.layout.fragment_profile_screen) {
    private lateinit var binding: FragmentProfileScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileScreenBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.imgVManageRoom.setOnClickListener {
            val intent = Intent(requireContext(), ManageRoomActivity::class.java)
            startActivity(intent)
        }

        binding.imageLogout.setOnClickListener {
            val intent = Intent(requireContext(), LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)

        }
        return root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val userRole =
//            arguments?.getString("userRole", "")
//
//        if (userRole == "Admin") {
//            binding.itemManageRoom.visibility = View.VISIBLE
//        }else{
//            binding.itemManageRoom.visibility = View.GONE
//        }
        val sharedPreferences = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val userRole = sharedPreferences.getString("userRole", "")

        if (userRole == "Admin") {
            binding.itemManageRoom.visibility = View.VISIBLE
        } else {
            binding.itemManageRoom.visibility = View.GONE
        }
    }
}