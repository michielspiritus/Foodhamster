package com.example.foodhamster

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_order.*
import kotlinx.android.synthetic.main.activity_rider.*

public class Orderregister :   AppCompatActivity(),View.OnClickListener    {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        volgendeorder.setOnClickListener (this)
         }


    private fun validate() :Boolean {
        if(naamorder.text.toString().isEmpty())
        {
            naamorder.error = "Niet openlaten"
            return false
        }
        else if(telefoonorder.text.toString().isEmpty())
        {
            telefoonorder.error = "Niet openlaten"
            return false
        }
        else if (orderadres.text.toString().isEmpty())
        {
            orderadres.error = "Niet openlaten"
            return false
        }
        startActivity(Intent(this,Order::class.java));
        return true

    }

    override fun onClick(v: View?) {
        when(v?.id)
        {
            R.id.volgendeorder->{
                if(validate())
                {
                    Toast.makeText(applicationContext,"Done", Toast.LENGTH_LONG).show()
                }

            }
        }
    }




}