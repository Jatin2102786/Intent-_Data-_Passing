package com.jatin.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var etName:TextView
        lateinit var etAge:TextView
        lateinit var etHeight:TextView
        lateinit var toolbar: Toolbar
        var name=""
        var age=""
        var height=""
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        etName=findViewById(R.id.tvname)
        etAge=findViewById(R.id.tvage)
        etHeight=findViewById(R.id.tvheight)
        toolbar=findViewById(R.id.toolbar)
        setActionBar(toolbar)
        name=intent?.getStringExtra("name").toString()
        age=intent?.getIntExtra("age",0).toString()
        height=intent?.getDoubleExtra("height",0.0).toString()
        etName.setText("the user name is=> $name")
        etAge.setText("the user age is=> $age")
        etHeight.setText("the user height is=> $height")


    }
}