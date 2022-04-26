package com.example.mobil

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobil.databinding.ActivityMainHosgeldinizBinding

class MainHosgeldiniz : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainHosgeldinizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //xmlden veri çekme kullancııya özel sayfa
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        var kayitliKullanici = preferences.getString("kullanici" , "")
        var kayitliParola= preferences.getString("parola" , "")
        //textviewlere bilgileri basma
        binding.kullaniciBilgisi.text = "Kullanıcı Adı : "+ kayitliKullanici.toString()
        binding.kullaniciParola.text = "Kullanıcı Parola : "+ kayitliParola.toString()
        //çıkış yap
        binding.btnCikisYap.setOnClickListener{
            intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()

        }

        binding.btnRezervasyon.setOnClickListener{
            intent = Intent(applicationContext,MainRezervasyon::class.java)
            startActivity(intent)

        }

        binding.btnSehir.setOnClickListener{
            intent = Intent(applicationContext,MainSehirler::class.java)
            startActivity(intent)

        }
        binding.btnKonum.setOnClickListener{
            intent = Intent(applicationContext,MainKonum::class.java)
            startActivity(intent)

        }
    }
}