package com.example.examenglobal2eva

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FaboriteMociesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faborite_mocies)

        var titulo = intent.getStringExtra("tituloPeli")
        var duracion = intent.getStringExtra("duracionPeli")
        var anno = intent.getStringExtra("annoPeli")
        var director = intent.getStringExtra("nombreDire")


        findViewById<Button>(R.id.atras3).setOnClickListener {
            var intento = Intent(this, MovieDisplayActivity::class.java)
            startActivity(intento)
        }
    }
}