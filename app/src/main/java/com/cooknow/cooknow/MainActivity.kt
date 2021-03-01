package com.cooknow.cooknow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.LogIn)
        val registerButton = findViewById<Button>(R.id.Register)

        loginButton.setOnClickListener {
            val intentlogin = Intent(this, LogInActivity::class.java).apply {  }
            startActivity(intentlogin)
        }

        registerButton.setOnClickListener {
            val intentregister = Intent(this, RegisterActivity::class.java).apply {  }
            startActivity(intentregister)
        }
    }
}