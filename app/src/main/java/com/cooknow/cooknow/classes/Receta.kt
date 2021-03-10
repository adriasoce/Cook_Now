package com.cooknow.cooknow.classes

import android.util.Log
import java.io.Serializable

class Receta (
    private val id: Int,
    private val nombre: String,
    private val imagen: Int,
    private val descripcion: String,
    private val duracion: String,
    private val raciones: String,
    private val dificultad: Int,
    private val ingredientes: MutableList<String>,
    private val pasos: MutableList<Pasos>,
    private val congrats: String,
    private val done: Boolean
): Serializable {

    fun dificultadStars(): String{

        if (this.dificultad == 1) return "⭐"
        else if (this.dificultad == 2) return "⭐⭐"
        else return "⭐⭐⭐"
    }

    fun getNombre(): String{
        return nombre
    }

    fun getImagen(): Int{
        return imagen
    }

    fun getDescripcion(): String{
        return descripcion
    }

    fun getDuracion(): String{
        return duracion
    }

    fun getRaciones(): String{
        return raciones
    }

    fun getDificultad(): Int{
        return dificultad
    }

    fun getCongrats(): String{
        return congrats
    }

    fun getStringIngredientes(): String{
        val ing = ""

        ingredientes.forEach{
            Log.i("RECETATEST", it)
        }

        return ing
    }

    fun getId(): Int{
        return id
    }

}