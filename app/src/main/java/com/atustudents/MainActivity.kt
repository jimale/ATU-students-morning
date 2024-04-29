package com.atustudents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayStudentName()
    }

    private fun displayStudentName(){

//        val textView : TextView = findViewById(R.id.student_name_tv)
        val editText : EditText = findViewById(R.id.student_name_et)
        val button : Button = findViewById(R.id.save_btn)


        button.setOnClickListener {
            // Do your task here
            val textFromEditText = editText.text.toString()
            //textView.text = textFromEditText

            //Starting new activity
            val intent = Intent(this,DisplayActivity::class.java)
            intent.putExtra("student_name",textFromEditText)
            startActivity(intent)


            //Display message
            //Toast.makeText(this,textFromEditText,Toast.LENGTH_LONG).show()
        }

    }
}