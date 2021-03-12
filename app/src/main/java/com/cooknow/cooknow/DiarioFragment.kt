package com.cooknow.cooknow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        val wally = view.findViewById<ImageView>(R.id.buscandoAWally)
        val recycler = view.findViewById<RecyclerView>(R.id.recyclerViewDiario)
        val opps = view.findViewById<TextView>(R.id.title_ups_diario)

        recetas = Recetario().getRecetarioDiario()

        if (recetas.size == 0){
            recycler.visibility = GONE
            wally.visibility = VISIBLE
            opps.visibility = VISIBLE
        }
        else{
            opps.visibility = GONE
            recycler.visibility = VISIBLE
            wally.visibility = GONE
        }



        return view
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerRecetario()
    }

    fun initRecyclerRecetario(){
        //recyclerView.addItemDecoration(OverlappingDecoration())
        recyclerViewDiario.layoutManager = LinearLayoutManager(activity)
        val adapter = DiarioAdapter(recetas)
        recyclerViewDiario.adapter = adapter
    }

}