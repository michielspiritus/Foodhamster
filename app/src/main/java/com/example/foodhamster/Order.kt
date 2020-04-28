package com.example.foodhamster


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_order2.*

class Order :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order2)
        volgendebutton.setOnClickListener {
        startActivity(Intent(this,Choosestore::class.java))
    }
         }


    }


