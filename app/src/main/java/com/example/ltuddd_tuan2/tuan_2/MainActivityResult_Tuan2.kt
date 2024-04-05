package com.example.ltuddd_tuan2.tuan_2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ltuddd_tuan2.R

class MainActivityResult_Tuan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_result_tuan2)
        var tvResult = findViewById<TextView>(R.id.tvResult)
        val il =intent
        val text1 = il.extras!!.getString("So1")
        val text2 = il.extras!!.getString("So2")
        val number1 = text1!!.toFloat()
        val number2 = text2!!.toFloat()
        val sump = number1 + number2
        tvResult!!.text = sump.toString()

    }
}