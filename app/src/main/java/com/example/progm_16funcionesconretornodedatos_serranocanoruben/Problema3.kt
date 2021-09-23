package com.example.progm_16funcionesconretornodedatos_serranocanoruben

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Problema3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3)

        val tvTitle = findViewById<TextView>(R.id.tvTitle30)
        val tvResult = findViewById<TextView>(R.id.tvResult30)
        val etString0 = findViewById<EditText>(R.id.etString300)
        val etString1 = findViewById<EditText>(R.id.etString301)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate30)

        btnCalculate.setOnClickListener {
            val string0 = etString0.text.toString()
            val string1 = etString1.text.toString()
            val result0 = "$string0 has ${string0.length} characters. "
            val result1 = "$string1 has ${string1.length} characters. "
            val result2 = isLongerThan(string0,string1)
            val endResult = result0.plus(result1).plus(result2)
            tvResult.text = endResult
        }
    }
    fun isLongerThan(string0:String,string1:String):String{
        if (string0.length > string1.length){
            return "$string0 is longer than $string1"
        } else
            return "$string1 is longer than $string0"
    }
}