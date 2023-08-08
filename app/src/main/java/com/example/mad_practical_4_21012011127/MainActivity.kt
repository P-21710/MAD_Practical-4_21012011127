package com.example.mad_practical_4_21012011127

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login : Button = findViewById(R.id.Login)
        val signup : Button = findViewById(R.id.Signup)
    login.setOnClickListener(){intent(this @Mainactivity.LoginActivity::class.java)also{start Activity(it)
    }
    }
}