package com.example.examenglobal2eva

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MovieDisplayActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_display)

        var titulo = intent.getStringExtra("tituloPeli")
        var duracion = intent.getStringExtra("duracionPeli")
        var anno = intent.getStringExtra("annoPeli")
        var director = intent.getStringExtra("nombreDire")

        var arrayPeliculas = ArrayList<Movie>()

        var pelicula = Movie(titulo.toString(), duracion.toString().toInt(), director.toString(), anno.toString().toInt())

        arrayPeliculas.add(pelicula)

        findViewById<TextView>(R.id.tit).text = titulo
        findViewById<TextView>(R.id.dir).text = director
        findViewById<TextView>(R.id.an).text = anno
        findViewById<TextView>(R.id.dur).text = duracion

        findViewById<Button>(R.id.atras2).setOnClickListener {
            var intento = Intent(this, MovieDetailsActivity::class.java)
            startActivity(intento)
        }

        findViewById<Button>(R.id.inicio).setOnClickListener {
            var intento = Intent(this, MovieTitleActivity::class.java)
            startActivity(intento)
        }

        findViewById<Button>(R.id.eliminar).setOnClickListener {
            arrayPeliculas.remove(pelicula)
            findViewById<TextView>(R.id.tit).text = ""
            findViewById<TextView>(R.id.dir).text = ""
            findViewById<TextView>(R.id.an).text = ""
            findViewById<TextView>(R.id.dur).text = ""
        }

        findViewById<Button>(R.id.marcarfab).setOnClickListener {
            var intento = Intent(this, FaboriteMociesActivity::class.java)

            intento.putExtra("tituloPeli",titulo)
            intento.putExtra("duracionPeli", duracion)
            startActivity(intento)
        }

    }
}