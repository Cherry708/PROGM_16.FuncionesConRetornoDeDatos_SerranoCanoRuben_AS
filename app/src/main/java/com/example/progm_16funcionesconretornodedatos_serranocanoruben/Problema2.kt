package com.example.progm_16funcionesconretornodedatos_serranocanoruben

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val tvResultado = findViewById<TextView>(R.id.tvResultado21)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular21)
        val etNumber1 = findViewById<EditText>(R.id.etNumber21)
        val etNumber2 = findViewById<EditText>(R.id.etNumber22)

        btnCalcular.setOnClickListener{
            val number1 = etNumber1.toString()
            val number2 = etNumber2.toString()
            if (number1.isNotEmpty() && number2.isNotEmpty()){
                val resultado = greaterValue(number1.toDouble(),number2.toDouble())
                tvResultado.text = resultado.toString()
            } else tvResultado.text = ""
        }
    }

    private fun greaterValue(number1:Double, number2:Double):Double{
        val greatestNumber = if (number1 > number2){
            number1
        } else number2
        return greatestNumber
    }
}