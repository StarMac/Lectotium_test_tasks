package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class DisplayMessageActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        button = findViewById(R.id.button)
        button.setOnClickListener(this)

        //Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        //Capture the layout's TextView and set the string as its text
        val  textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }

    override fun onClick(p0: View?) {
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, message, duration)
        toast.show()
    }
}