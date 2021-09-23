package com.example.progm_16funcionesconretornodedatos_serranocanoruben

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ProblemasPropuestos1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problemas_propuestos1)

        val etInteger0 = findViewById<EditText>(R.id.etInteger40)
        val etInteger1 = findViewById<EditText>(R.id.etInteger41)
        val tvResult = findViewById<TextView>(R.id.tvResult40)
        val btnGetAverage = findViewById<Button>(R.id.btnAverage40)

        btnGetAverage.setOnClickListener {
            val number0 = etInteger0.text.toString().toInt()
            val number1 = etInteger1.text.toString().toInt()
            val greatestValue = getGreaterValue(number0, number1)
            val result = "$greatestValue is the greatest side"
            tvResult.text = result
        }

    }

    fun getGreaterValue(number0:Int, number1:Int):Int{
        when{
            number0 > number1 -> return number0
            number1 > number0 -> return number1
        }
        return 0
    }
}