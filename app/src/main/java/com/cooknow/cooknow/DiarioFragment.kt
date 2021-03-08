package com.cooknow.cooknow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cooknow.cooknow.classes.OverlappingDecoration
import com.cooknow.cooknow.classes.Receta
import com.cooknow.cooknow.classes.Recetario
import kotlinx.android.synthetic.main.fragment_diario.*

class DiarioFragment : Fragment() {

    val recetas = Recetario().recetario

    var shuffledRecetas = recetas.shuffle()
    var subRecetas = recetas.subList(1, 4)


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
        recetas.shuffle()
        var subRecetas = recetas.subList(1, 5)
        recyclerView.addItemDecoration(OverlappingDecoration())
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val adapter = DiarioAdapter(subRecetas)
        recyclerView.adapter = adapter
    }

}