package com.cooknow.cooknow.classes

class RecetaKt(
    private val nombre: String,
    private val imagen: String,
    private val descripcion: String,
    private val popularidad: String,
    private val duracion: String,
    private val personas: String,
    private val dificultad: Int
) {

    fun getNombre(): String{
        return nombre
    }

    fun getImagen(): String{
        return imagen
    }

    fun getDescripcion(): String{
        return descripcion
    }

    fun getPopularidad(): String{
        return popularidad
    }

    fun getDuracion(): String{
        return duracion
    }

    fun getPersonas(): String{
        return personas
    }

    fun getDificultad(): Int{
        return dificultad
    }

}