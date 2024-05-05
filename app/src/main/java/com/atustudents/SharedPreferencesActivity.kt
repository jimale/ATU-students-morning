package com.atustudents

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SharedPreferencesActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var textView : TextView
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)
        saveNameToSharedPreferences()
    }

    private fun saveNameToSharedPreferences(){
        //Init shared prefences
        val sharedPreference =  getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        val editor = sharedPreference.edit()

        //Init views
        button = findViewById(R.id.save_btn)
        textView = findViewById(R.id.display_name_tv)
        editText = findViewById(R.id.name_tv)

        //Save name to the shared preferences
        button.setOnClickListener {
            val textFromEditText = editText.text.toString()
            editor.putString("name",textFromEditText).apply()
            Toast.makeText(this, "Successfully saved", Toast.LENGTH_SHORT).show()
        }

        //Get the name from the shared preferences then display
        val name = sharedPreference.getString("name","not saved name")
        textView.text = "The saved name is $name"

    }
}