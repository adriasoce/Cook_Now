package com.cooknow.cooknow

import android.content.Intent
import android.media.Image
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.*
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.cooknow.cooknow.classes.Recetario

class PasosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasos)


        val receta_id: Int = intent.getIntExtra("IdReceta", 0)

        val receta = Recetario().getReceta(receta_id)

        this.supportActionBar!!.title = receta.getNombre()

        val anteriorButton = findViewById<Button>(R.id.buttonAnterior)
        val siguienteButton = findViewById<Button>(R.id.buttonSiguiente)
        val tituloPasos = findViewById<TextView>(R.id.title_pasos)
        val textPasos = findViewById<TextView>(R.id.textPasos)
        val subeFoto = findViewById<Button>(R.id.buttonFoto)
        val congratsImage = findViewById<ImageView>(R.id.ImageCongrats)

        subeFoto.visibility = INVISIBLE
        congratsImage.visibility = GONE

        val pasos = receta.getPasos()

        val pasosSize = pasos.size

        var pasoActual = 1

        val pasosChange = "Paso $pasoActual de $pasosSize"
        textPasos.text = receta.getPasosId(1).getContenido()


        tituloPasos.text = pasosChange

        anteriorButton.text = resources.getString(R.string.RecetaAnterior)



        siguienteButton.setOnClickListener {

            if (pasoActual == pasosSize - 1){
                pasoActual = pasosSize

                anteriorButton.text = resources.getString(R.string.Anterior)
                siguienteButton.text = resources.getString(R.string.FinalizarSiguiente)

                val siguientePasosChange = "Paso $pasoActual de $pasosSize"
                tituloPasos.text = siguientePasosChange

                textPasos.text = receta.getPasosId(pasoActual).getContenido()

                subeFoto.visibility = VISIBLE
            }
            else if (pasoActual == pasosSize){

                receta.setDone(true)

                val intentTerminado = Intent(this, BottomNavigationActivity::class.java).apply {  }
                startActivity(intentTerminado)

            }
            else{
                pasoActual += 1

                anteriorButton.text = resources.getString(R.string.Anterior)
                siguienteButton.text = resources.getString(R.string.Siguiente)

                val siguientePasosChange = "Paso $pasoActual de $pasosSize"
                tituloPasos.text = siguientePasosChange
                textPasos.text = receta.getPasosId(pasoActual).getContenido()
            }

        }


        anteriorButton.setOnClickListener {

            if (pasoActual == 2){
                pasoActual = 1
                anteriorButton.text = resources.getString(R.string.RecetaAnterior)
                siguienteButton.text = resources.getString(R.string.Siguiente)

                val siguientePasosChange = "Paso $pasoActual de $pasosSize"
                tituloPasos.text = siguientePasosChange
                textPasos.text = receta.getPasosId(pasoActual).getContenido()
            }
            else if (pasoActual == 1){
                onBackPressed()
            }
            else {
                pasoActual -= 1
                anteriorButton.text = resources.getString(R.string.Anterior)
                siguienteButton.text = resources.getString(R.string.Siguiente)

                val siguientePasosChange = "Paso $pasoActual de $pasosSize"
                tituloPasos.text = siguientePasosChange
                textPasos.text = receta.getPasosId(pasoActual).getContenido()

                subeFoto.visibility = INVISIBLE
            }

        }

        subeFoto.setOnClickListener {
            tituloPasos.text = resources.getString(R.string.Congrats)
            textPasos.text = receta.getCongrats()

            congratsImage.visibility = VISIBLE
            anteriorButton.visibility = INVISIBLE
            subeFoto.visibility = INVISIBLE

        }
    }
}