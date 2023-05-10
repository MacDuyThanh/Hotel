package com.example.royalhotel.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.royalhotel.R
import com.example.royalhotel.databinding.ActivityMainBinding
import com.example.royalhotel.screens.HomeScreen.HomeScreen
import com.example.royalhotel.screens.ProfileScreen.ProfileScreen

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeScreen())
        binding.mainMenu.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.homeScreen -> replaceFragment(HomeScreen())
                R.id.profileScreen -> replaceFragment(ProfileScreen())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager

        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.MainFrameLayout, fragment)

//        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }
}