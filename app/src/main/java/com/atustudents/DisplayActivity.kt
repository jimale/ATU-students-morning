package com.atustudents

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        displayStudent()
    }

    private fun displayStudent(){

        val textView: TextView = findViewById(R.id.student_name_tv)
        val name: String = intent.getStringExtra("student_name").toString()
        textView.text = "Student name is $name"

    }
}