package com.example.mobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobil.databinding.ActivityMainKonumBinding
import com.example.mobil.databinding.ActivityMainSehirlerBinding

class MainKonum : AppCompatActivity() {
    lateinit var binding: ActivityMainKonumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainKonumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button5.setOnClickListener {
            intent = Intent(applicationContext, MainTuzla::class.java)
            startActivity(intent)
        }
        binding.button6.setOnClickListener {
            intent = Intent(applicationContext, MainPendik::class.java)
            startActivity(intent)
        }
    }
}