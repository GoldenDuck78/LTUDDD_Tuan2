package com.example.ltuddd_tuan2.tuan_2

import android.annotation.SuppressLint
import android.os.Bundle

import android.content.Intent
import android.widget.EditText
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ltuddd_tuan2.R

class MainActivity_Tuan2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tuan2)
        var string1 = findViewById<EditText>(R.id.Text1)
        var string2 = findViewById<EditText>(R.id.Text2)
        var btn = findViewById<Button>(R.id.btn)

        btn!!.setOnClickListener {
            var i = Intent(this@MainActivity_Tuan2, MainActivityResult_Tuan2::class.java)
            i.putExtra("So1", string1!!.text.toString())
            i.putExtra("So2", string2!!.text.toString())
            startActivity(i)
        }
    }
}