package com.example.royalhotel.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.demomanagehotel.data.User
import com.example.demomanagehotel.data.getAllUser
import com.example.royalhotel.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        register()
    }

    private fun register() {

        binding.buttonRegister.setOnClickListener {
            val dataUser: ArrayList<User> = getAllUser()
            val userId = dataUser.size + 1
            val role = "User"
            val username = binding.editTextUsernameRegister.text.toString()
            val password = binding.editTextPasswordRegister.text.toString()

            val newUser = User(userId,role,username,password)

            if (dataUser.any { it.userName == newUser.userName }){
                Toast.makeText(this,"Username Exist", Toast.LENGTH_SHORT).show()
            }else{
                dataUser.add(newUser)
                Toast.makeText(this,"Register Success", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }


            Log.d("CheckRegister", "$dataUser")
        }
    }
}