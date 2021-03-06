package com.cooknow.cooknow.classes

import android.util.Log

class Receta(
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
    private var done: Boolean,
    private var descartada: Boolean = false,
    private var comprado: Boolean = false
) {

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

    fun getCongrats(): String{
        return congrats
    }

    fun getDone(): Boolean{
        return done
    }

    fun getStringIngredientes(): String{
        return ingredientes.joinToString(separator = "\n\n")
    }

    fun getPasos(): MutableList<Pasos>{
        return pasos
    }

    fun getPasosId(id: Int): Pasos{

        val size = pasos.size - 1

        for (i: Int in (0..size)){
            if (pasos[i].getId() == id) return pasos[i]
        }

        return pasos[0]
    }

    fun getId(): Int{
        return id
    }

    fun getComprado(): Boolean{
        return comprado
    }

    fun getDescartada(): Boolean{
        return descartada
    }

    fun setDone(d: Boolean){
        this.done = d
    }

    fun setComprado(c: Boolean){
        this.comprado = c
    }

    fun setDescartada(descarte: Boolean){
        this.descartada = descarte
    }

}