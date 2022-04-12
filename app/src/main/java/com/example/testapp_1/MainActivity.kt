package com.example.testapp_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tapHere: Button = findViewById(R.id.button_tap_here)
        val testApp : TextView = findViewById(R.id.text_test_app)
        tapHere.setOnClickListener{
            tapHere.visibility = View.GONE
            testApp.visibility = View.VISIBLE
        }
    }
}