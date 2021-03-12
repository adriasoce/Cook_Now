package com.cooknow.cooknow.classes

class Pasos(
    private val id: Int,
    private val contenido: String
) {

    fun getId(): Int{
        return id
    }

    fun getContenido(): String{
        return contenido
    }


}