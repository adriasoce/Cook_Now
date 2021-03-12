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

    var recetas = Recetario().getRecetarioDiario()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_diario, container, false)
        // IMPLEMENT

        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Diario"

        recetas = Recetario().getRecetarioDiario()

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerRecetario()
    }

    fun initRecyclerRecetario(){
        //recyclerView.addItemDecoration(OverlappingDecoration())
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val adapter = DiarioAdapter(recetas)
        recyclerView.adapter = adapter
    }

}