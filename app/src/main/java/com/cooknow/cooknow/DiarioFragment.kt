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
        RecetaKt("Tortilla", "x", "Paso 1", "20", "4", "3", "3"),
        RecetaKt("Macarrones", "71", "Paso 4", "20", "4", "3", "4"),
        RecetaKt("Pizza 4 quesos", "4", "Paso 1", "20", "4", "3", "5"),
        RecetaKt("Tortilla", "8", "Paso 1", "20", "4", "3", "1"),
        RecetaKt("Tortilla", "2", "Paso 1", "20", "4", "3", "3"),
        RecetaKt("Tortilla", "Paso 1", "Paso 1", "20", "4", "3", "2"),
        RecetaKt("Tortilla", "Paso 1", "Paso 1", "20", "4", "3", "4"),
        RecetaKt("Tortilla", "Paso 1", "Paso 1", "20", "4", "3", "1")
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