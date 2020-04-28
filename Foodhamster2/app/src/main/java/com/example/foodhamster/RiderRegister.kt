package com.example.foodhamster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rider.*

class RiderRegister : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rider)
        volgenderider.setOnClickListener (this)
    }
private fun validate() :Boolean {
    if(naamrider.text.toString().isEmpty())
    {
        naamrider.error = "Niet openlaten"
        return false
    }
    else if(telefoonrider.text.toString().isEmpty())
    {
        telefoonrider.error = "Niet openlaten"
        return false
    }
    else if (rekeningrider.text.toString().isEmpty())
    {
        rekeningrider.error = "Niet openlaten"
        return false
    }
    return true

}

    override fun onClick(v: View?) {
       when(v?.id)
       {
        R.id.volgenderider->{
            if(validate())
            {
                Toast.makeText(applicationContext,"Done",Toast.LENGTH_LONG).show()
            }

        }
       }
    }

}