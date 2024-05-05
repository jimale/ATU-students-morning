package com.atustudents

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.transition.Visibility

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayStudentName()
        imageViewSample()
        openWebViewActivity()
        openSharedPreferencesActivity()
    }

    private fun openWebViewActivity(){
        val button : Button = findViewById(R.id.open_web_btn)
        button.setOnClickListener {
            val intent = Intent(this,WebViewActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openSharedPreferencesActivity(){
        val button : Button = findViewById(R.id.open_sharedPref_btn)
        button.setOnClickListener {
            val intent = Intent(this,SharedPreferencesActivity::class.java)
            startActivity(intent)
        }
    }

    private fun imageViewSample() {
        val imageView: ImageView = findViewById(R.id.student_pic)
        val editText: EditText = findViewById(R.id.student_name_et)
        val button: Button = findViewById(R.id.save_btn)

        imageView.setOnClickListener {
            editText.visibility = View.GONE
            button.visibility = View.GONE
        }

        button.setOnClickListener {
            imageView.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.image_two_24)
            )
        }
    }

    private fun displayStudentName() {

//        val textView : TextView = findViewById(R.id.student_name_tv)
        val editText: EditText = findViewById(R.id.student_name_et)
        val button: Button = findViewById(R.id.save_btn)


        button.setOnClickListener {
            // Do your task here
            val textFromEditText = editText.text.toString()
            //textView.text = textFromEditText

            //Starting new activity
            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("student_name", textFromEditText)
            startActivity(intent)


            //Display message
            //Toast.makeText(this,textFromEditText,Toast.LENGTH_LONG).show()
        }

    }
}