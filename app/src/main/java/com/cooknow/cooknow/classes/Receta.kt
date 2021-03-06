package com.cooknow.cooknow.classes

class Receta(
    private val nombre: String,
    private val descripcion: String,
    private val imagen: String,
    private val popularidad: Int = 0,
    private val duracion: Int,
    private val personas: Int,
    private val dificultad: Int
) {

    fun dificultadStars(): String{

        if (this.dificultad == 1) return "⭐"
        else if (this.dificultad == 2) return "⭐⭐"
        else return "⭐⭐⭐"
    }

}