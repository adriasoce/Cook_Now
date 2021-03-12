package com.cooknow.cooknow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)

        val btn = findViewById<Button>(R.id.buttonRegister)

        btn.setOnClickListener {
            val intentTEST = Intent(this, BottomNavigationActivity::class.java).apply {  }
            startActivity(intentTEST)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}