package com.example.agenda_karina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agenda_karina.databinding.ActivityAgendaBinding
import com.example.agenda_karina.databinding.ActivityMainBinding

class Agenda : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val parExtra= intent.extras
        val nombre= parExtra?.getString("nombre")
        binding.textView3.text= nombre.toString()
        binding.button.setOnClickListener(){
            val intento3 = Intent(this, MainActivity::class.java)
            startActivity(intento3)
        }
    }
}