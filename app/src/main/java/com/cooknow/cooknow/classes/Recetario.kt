package com.cooknow.cooknow.classes

class Recetario(
    private val nombre: String,
    private val imagen: Int
) {
    fun getnombre(): String {
        return nombre
    }
    fun getimagen(): Int {
        return imagen
    }
}