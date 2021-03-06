package com.cooknow.cooknow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cooknow.cooknow.classes.RecetaKt
import kotlinx.android.synthetic.main.fragment_diario.*

class DiarioFragment : Fragment() {

    var recetas: List<RecetaKt> = listOf(
        RecetaKt("Tortilla", "x", "Esta receta viene de España y ha ganado mucha popularidad porque y...", "20", "10 minutos", "2 comensales", 3),
        RecetaKt("Macarrones", "71", "Esta de Italia x y lo hace todo el mundo porque es facil...", "20", "6 minutos", "3 comensales", 4),
        RecetaKt("Pizza 4 quesos", "4", "Esta receta viene de EEUU y ha ganado mucha popularidad porque y lo han vendido muy bien por todo el mundo, no toma mucho tiempo y esta muy buena. Creemos que te podria encantar. muchos animos...", "20", "15 minutos", "5 comensales", 5),
        RecetaKt("Tortilla", "8", "Paso 1", "20", "4", "3", 1),
        RecetaKt("Tortilla", "2", "Paso 1", "20", "4", "3", 3),
        RecetaKt("Tortilla", "Paso 1", "Paso 1", "20", "4", "3", 2),
        RecetaKt("Tortilla", "Paso 1", "Paso 1", "20", "4", "3", 4),
        RecetaKt("Tortilla", "Paso 1", "Paso 1", "20", "4", "3", 1)
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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerRecetario()
    }

    fun initRecyclerRecetario(){
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val adapter = DiarioAdapter(recetas)
        recyclerView.adapter = adapter
    }

}