package com.example.foodhamster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       orderbutton.setOnClickListener { startActivity(Intent(this, Orderregister::class.java)) }
       riderbutton.setOnClickListener { startActivity(Intent(this, RiderRegister::class.java)) }


        }

    }

