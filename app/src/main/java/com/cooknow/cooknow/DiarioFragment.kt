package com.cooknow.cooknow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cooknow.cooknow.classes.RecetaKt

class DiarioFragment : Fragment() {

    var recetas: List<RecetaKt> = listOf(
        RecetaKt("Tortilla", "Paso 1", "345", "20", "4", "3", "3"),
        RecetaKt("Tortilla", "Paso 1", "345", "20", "4", "3", "4"),
        RecetaKt("Tortilla", "Paso 1", "345", "20", "4", "3", "5"),
        RecetaKt("Tortilla", "Paso 1", "345", "20", "4", "3", "1"),
        RecetaKt("Tortilla", "Paso 1", "345", "20", "4", "3", "3"),
        RecetaKt("Tortilla", "Paso 1", "345", "20", "4", "3", "2"),
        RecetaKt("Tortilla", "Paso 1", "345", "20", "4", "3", "4"),
        RecetaKt("Tortilla", "Paso 1", "345", "20", "4", "3", "1")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_diario, container, false)


        // IMPLEMENT

        (activity as AppCompatActivity?)!!.title = "Diario"






        return view
    }

}