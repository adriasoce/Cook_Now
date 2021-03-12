package com.cooknow.cooknow

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
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

        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)


        val receta_id: Int = intent.getIntExtra("Receta", 0)

        val receta = Recetario().getReceta(receta_id)

        val titulo = findViewById<TextView>(R.id.title_receta)
        val imagen = findViewById<ImageView>(R.id.ImageReceta)
        val ingredientes = findViewById<TextView>(R.id.textIngredientes)
        val tiempo = findViewById<TextView>(R.id.textTiempo)
        val raciones = findViewById<TextView>(R.id.textRaciones)
        val dificultad = findViewById<TextView>(R.id.textDificultad)

        val aCocinar = findViewById<Button>(R.id.buttonCocinar)
        val anadirIngredientes = findViewById<Button>(R.id.buttonIngredientes)

        titulo.text = receta.getNombre()
        imagen.setImageDrawable(ContextCompat.getDrawable(this, receta.getImagen()))
        ingredientes.text = receta.getStringIngredientes()
        tiempo.text = receta.getDuracion()
        raciones.text = receta.getRaciones()
        dificultad.text = receta.dificultadStars()


        aCocinar.setOnClickListener{
            val intentPasos = Intent(this, PasosActivity::class.java).apply {  }
            intentPasos.putExtra("IdReceta", receta.getId())
            startActivity(intentPasos)
        }

        anadirIngredientes.setOnClickListener {

        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}