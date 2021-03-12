package com.cooknow.cooknow

import android.Manifest
import android.R.attr
import android.app.Activity
import android.content.ContentResolver
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.provider.SyncStateContract.Helpers.insert
import android.view.View.*
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cooknow.cooknow.classes.Recetario
import kotlinx.android.synthetic.main.activity_pasos.*


class PasosActivity : AppCompatActivity() {

    private val REQUEST_CAMERA = 1001
    var foto: Uri? = null

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
        //val congratsImage = findViewById<ImageView>(R.id.ImageCongrats)



        subeFoto.visibility = INVISIBLE
        ImageCongrats.visibility = GONE

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

            ImageCongrats.visibility = VISIBLE

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if(checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED
                    || checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
                    val permisosCamara = arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    requestPermissions(permisosCamara, REQUEST_CAMERA)
                }else{
                    abrirCamara()
                }
            }else{
                abrirCamara()
            }





            tituloPasos.text = resources.getString(R.string.Congrats)
            textPasos.text = receta.getCongrats()


            anteriorButton.visibility = INVISIBLE
            subeFoto.visibility = INVISIBLE

        }
    }

    fun abrirCamara(){
        val value = ContentValues()
        value.put(MediaStore.Images.Media.TITLE, "Nueva imagen")
        foto = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, value)

        val camaraintent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        camaraintent.putExtra(MediaStore.EXTRA_OUTPUT, foto)
        startActivityForResult(camaraintent, REQUEST_CAMERA)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CAMERA && resultCode == Activity.RESULT_OK) {

            ImageCongrats.setImageURI(foto)

        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode){
            REQUEST_CAMERA -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    abrirCamara()
                }else{
                    Toast.makeText(this, "No se ha podido acceder a la Camara", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}