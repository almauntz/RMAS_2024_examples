package com.example.kviz1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)

        trueButton.setOnClickListener {
            Toast.makeText(this, R.string.correct_text, Toast.LENGTH_SHORT).show()
        }

        falseButton.setOnClickListener {
            Toast.makeText(this, R.string.wrong_text, Toast.LENGTH_SHORT).show()
        }

    }
}