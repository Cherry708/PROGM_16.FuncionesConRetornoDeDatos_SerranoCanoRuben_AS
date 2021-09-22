package com.example.progm_16funcionesconretornodedatos_serranocanoruben

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvTitulo = findViewById<TextView>(R.id.tvTitle)
        val etUserInput = findViewById<EditText>(R.id.etUserInput)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            val userInputString = etUserInput.text.toString()
            if (userInputString.isNotEmpty()){
                val userInput = userInputString.toDouble()
                tvResultado.text = calcularSuperficie(userInput)
            } else
                tvResultado.text = ""
        }

    }
    fun calcularSuperficie(lado:Double): String{
        return "El resultado es: ${lado*4}"
    }
}