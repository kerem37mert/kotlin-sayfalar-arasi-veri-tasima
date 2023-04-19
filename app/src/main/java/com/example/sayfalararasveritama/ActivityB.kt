package com.example.sayfalararasveritama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasveritama.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var design: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design = ActivityBBinding.inflate(layoutInflater)
        setContentView(design.root)

        val getMessage = intent.getStringExtra("mesaj")
        design.textViewOutput.text = getMessage
    }
}