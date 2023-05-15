package com.example.userinputapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var display_text:TextView
    lateinit var userinput_edt:EditText
    lateinit var btn_sub:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text = findViewById(R.id.txtdisp)
        userinput_edt = findViewById(R.id.EDT)
        btn_sub = findViewById(R.id.btnsubmit)

        btn_sub.setOnClickListener {
            var
        }
    }
}