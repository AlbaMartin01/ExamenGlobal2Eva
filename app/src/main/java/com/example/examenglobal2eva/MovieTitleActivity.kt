package com.example.examenglobal2eva

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MovieTitleActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.aceptar1).setOnClickListener {
            if (findViewById<EditText>(R.id.titulo).text.toString() != "" && findViewById<EditText>(R.id.duracion).text.toString().toInt() > 0){
                var intento = Intent(this, MovieDetailsActivity::class.java)
                intento.putExtra("tituloPeli", findViewById<EditText>(R.id.titulo).text.toString())
                intento.putExtra("duracionPeli", findViewById<EditText>(R.id.duracion).text.toString().toInt())
                startActivity(intento)
            } else{
                Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show()
            }
        }
    }
}