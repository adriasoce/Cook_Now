package com.cooknow.cooknow.classes

class RecetaKt(
    private val nombre: String,
    private val imagen: String,
    private val descripcion: String,
    private val popularidad: String,
    private val duracion: String,
    private val personas: String,
    private val dificultad: String
) {

    fun getNombre(): String{
        return nombre
    }

    fun getDescripcion(): String{
        return descripcion
    }

}