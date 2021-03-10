package com.cooknow.cooknow

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.cooknow.cooknow.classes.Receta
import com.cooknow.cooknow.classes.Recetario


class RecetaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)


        //val receta: String = intent.getSerializableExtra("Receta") as String

        Log.i("RECETATEST", "Conseguido")

        val receta_id: Int = intent.getIntExtra("Receta", 0)

        val receta = Recetario().getReceta(receta_id)

        val titulo = findViewById<TextView>(R.id.title_receta)
        val imagen = findViewById<ImageView>(R.id.ImageReceta)
        val ingredientes = findViewById<TextView>(R.id.textIngredientes)
        val tiempo = findViewById<TextView>(R.id.textTiempo)
        val raciones = findViewById<TextView>(R.id.textRaciones)
        val dificultad = findViewById<TextView>(R.id.textDificultad)

        titulo.text = receta.getNombre()
        imagen.setImageDrawable(ContextCompat.getDrawable(this, receta.getImagen()))

        Log.i("RECETATEST", "Antes ingredientes")

        //receta.getStringIngredientes()


        Log.i("RECETATEST", "Despues ingredientes")

        tiempo.text = receta.getDuracion()
        raciones.text = receta.getRaciones()
        dificultad.text = receta.dificultadStars()


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}