package com.example.examenglobal2eva

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MovieDetailsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        var titulo = intent.getStringExtra("tituloPeli")
        var duracion = intent.getStringExtra("duracionPeli")

        findViewById<Button>(R.id.aceptar2).setOnClickListener {
            if (findViewById<EditText>(R.id.director).text.toString() != "" && findViewById<EditText>(R.id.anno).text.toString().toInt() > 0) {
                var intento = Intent(this, MovieDisplayActivity::class.java)
                intento.putExtra("tituloPeli",titulo)
                intento.putExtra("duracionPeli", duracion)
                intento.putExtra("nombreDire",findViewById<EditText>(R.id.director).text.toString())
                intento.putExtra("annoPeli", findViewById<EditText>(R.id.anno).text.toString().toInt())
                startActivity(intento)
            } else{
                Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.atras1).setOnClickListener {
            var intento = Intent(this, MovieDetailsActivity::class.java)
            startActivity(intento)
        }
    }
}