package com.jatin.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        lateinit var etName:EditText
        lateinit var etAge:EditText
        lateinit var etHeight:EditText
        lateinit var btn:Button
        lateinit var toolbar:Toolbar

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName=findViewById(R.id.etname)
        etAge=findViewById(R.id.etage)
        etHeight=findViewById(R.id.etheight)
        btn=findViewById(R.id.btn)
        toolbar=findViewById(R.id.toolbar)
        setActionBar(toolbar)
        btn.setOnClickListener {
            if(etName.text.toString().isNullOrEmpty())
            {
                etName.error="This field is not optional"
            }
            else if (etAge.text.toString().toInt()<18)
            {
                etAge.error="Your age is not Acceptable"
            }
            else
            {
                Toast.makeText(this, "validation completed", Toast.LENGTH_SHORT).show()
                var intent =Intent(this,MainActivity2::class.java)
                intent.putExtra("name",etName.text.toString())
                intent.putExtra("age",etAge.text.toString().toInt())
                intent.putExtra("height",etHeight.text.toString().toDouble())

                startActivity(intent)



            }
        }

    }
}