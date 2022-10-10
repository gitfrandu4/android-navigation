package com.example.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.inflate
import com.example.navigation.databinding.ActivityLoginBinding
import com.example.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Log.i("MainActivity", "OnCreate")

        binding.login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("suggested_email", "fran4@email.es")
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()

        Log.i("MainActivity", "OnResume")
    }
}