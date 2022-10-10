package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.navigation.databinding.ActivityLoginBinding
import com.example.navigation.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Log.i("LoginActivity", "OnCreate")

        // Leemos los extras del intent que ha usado el MainActivity para navegar al LoginActivity
        // que se pasan al activity destino
        val bundle: Bundle? = intent.extras
        val suggestedEmail: String? = bundle?.getString("suggested_email")

        binding.email.setText(suggestedEmail)
        Log.i("LoginActivity", "$suggestedEmail")
    }
}