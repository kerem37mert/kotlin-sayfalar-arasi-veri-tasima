package com.example.sayfalararasveritama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasveritama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var design: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design = ActivityMainBinding.inflate(layoutInflater)
        setContentView(design.root)

        design.buttonSend.setOnClickListener {
            val data = design.editTextInput.text.toString()
            val newIntent = Intent(this@MainActivity,ActivityB::class.java)
            newIntent.putExtra("mesaj",data)
            startActivity(newIntent)
        }
    }
}