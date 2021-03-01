package com.cooknow.cooknow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cooknow.cooknow.classes.Usuario

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)

        val accessButton = findViewById<Button>(R.id.buttonAccess)

        val createAccount = findViewById<TextView>(R.id.textCreateAccount)
        val forgotPassword = findViewById<TextView>(R.id.textForgotPassword)

        val emailAddress = findViewById<EditText>(R.id.editTextEmailAddress)
        val password = findViewById<EditText>(R.id.editTextPassword)

        createAccount.setOnClickListener {
            val intentCreate = Intent(this, RegisterActivity::class.java).apply {  }
            startActivity(intentCreate)
        }

        forgotPassword.setOnClickListener {
            val intentForgot = Intent(this, ForgotPasswordActivity::class.java).apply {  }
            startActivity(intentForgot)
        }


        accessButton.setOnClickListener {

            val TEST = emailAddress.text.toString() + "\n" + password.text.toString()

            Toast.makeText(this, TEST, Toast.LENGTH_SHORT).show()


            val intentTEST = Intent(this, BottomNavigationActivity::class.java).apply {  }
            startActivity(intentTEST)

        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}