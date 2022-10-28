package com.example.agenda_karina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.agenda_karina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val agenda=ArrayList<Agendaa>()
        binding.btnAgregar.setOnClickListener(){
            val nombre=binding.editTextTextPersonName.text.toString()
            val nocontrol=binding.editTextTextPersonName2.text.toString()
            agenda.add(Agendaa("$nombre","$nocontrol"))
            binding.textView4.text="Contactos:${agenda.count()}"

                if (nombre=="" || nocontrol==""){
                    Toast.makeText(this,"Completa los campos",Toast.LENGTH_SHORT).show()
                } else {
                    agenda.add(Agendaa("$nombre","$nocontrol"))
                    binding.textView4.text = "Contactos: ${agenda.count()}"
                }
            }

        binding.button2.setOnClickListener(){
            val indice=binding.editTextTextPersonName3.text.toString().toInt()
            val numero=indice -1
            val  rindice= Intent(this,Agenda::class.java)
            rindice.putExtra("nombre", "${agenda[numero].nombre}")

            startActivity(rindice)
        }
    }
}