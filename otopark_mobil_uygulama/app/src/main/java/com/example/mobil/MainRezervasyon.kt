package com.example.mobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobil.databinding.ActivityMainKayitOlBinding
import com.example.mobil.databinding.ActivityMainRezervasyonBinding

class MainRezervasyon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainRezervasyonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnrezervasyonYap.setOnClickListener{

            intent = Intent(applicationContext,Mainrezyap::class.java)
            startActivity(intent)

        }
    }
}