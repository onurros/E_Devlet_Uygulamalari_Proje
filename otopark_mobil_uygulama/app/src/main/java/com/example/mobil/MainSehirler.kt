package com.example.mobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobil.databinding.ActivityMainSehirlerBinding

class MainSehirler : AppCompatActivity() {
    lateinit var binding: ActivityMainSehirlerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainSehirlerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            intent = Intent(applicationContext, MainIstanbul::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            intent = Intent(applicationContext, MainAnkara::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            intent = Intent(applicationContext, MainIzmir::class.java)
            startActivity(intent)
        }
        binding.button4.setOnClickListener {
            intent = Intent(applicationContext, MainSakarya::class.java)
            startActivity(intent)
        }


    }

}