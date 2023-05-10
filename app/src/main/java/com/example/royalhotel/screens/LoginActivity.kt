package com.example.royalhotel.screens

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.demomanagehotel.data.User
import com.example.demomanagehotel.data.getAllUser
import com.example.royalhotel.databinding.ActivityLoginBinding
import com.example.royalhotel.databinding.FragmentProfileScreenBinding
import com.example.royalhotel.screens.ProfileScreen.ProfileScreen

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var bindingProfile: FragmentProfileScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        login()

        binding.textViewSignup.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }



    fun login() {
        binding.buttonLogin.setOnClickListener {
            val dataUser: ArrayList<User> = getAllUser()
            val userName = binding.editTextUsername.text.toString()
            val password = binding.editTextPassword.text.toString()
            for (u in dataUser) {
                if (u.userName == userName && u.password == password) {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
//                    bindingProfile = binding.layoutProfile
//                    if (u.role == "Admin"){
//                        bindingProfile.itemManageRoom.visibility = View.VISIBLE
//                    }else{
//                        bindingProfile.itemManageRoom.visibility = View.GONE
//                    }
//                    val bundle = Bundle()
//                    val role = u.role
//                    bundle.putString("userRole",role)
//                    val fragmentProfile = ProfileScreen()
//                    fragmentProfile.arguments = bundle
//                    Log.d("checkRole", "role:$role")

                    val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
                    val role = u.role
                    sharedPreferences.edit().putString("userRole", role).apply()

                }
            }
            Log.d("login", "user:$userName pass:$password")

        }
    }
}