package com.jyotsna.turningyourphone

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import android.widget.Toast.*

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main_landscape)
        } else {
            setContentView(R.layout.activity_main)
        }

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)

        button.setOnClickListener {
            val enteredText = editText.text.toString()
            makeText(this, "Entered Text: $enteredText", LENGTH_SHORT).show()
        }
    }

}