package com.example.mobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mobil.databinding.ActivityMainKayitOlBinding
import com.example.mobil.databinding.ActivityMainrezyapBinding

class Mainrezyap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainrezyapBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnGeriDon.setOnClickListener{

            intent = Intent(applicationContext,MainRezervasyon::class.java)
            startActivity(intent)

        }
        binding.btnOnayla.setOnClickListener{
            Toast.makeText(applicationContext,"Rezervsayon Başarılı", Toast.LENGTH_LONG).show()
        }
    }
}