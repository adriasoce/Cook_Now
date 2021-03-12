package com.cooknow.cooknow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cooknow.cooknow.classes.Recetario
import kotlinx.android.synthetic.main.fragment_lista_compra.*


class ListaCompraFragment : Fragment() {

    var recetas = Recetario().getListaCompra()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_lista_compra, container, false)

        recetas = Recetario().getListaCompra()



        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Lista de la Compra"


        val wally = view.findViewById<ImageView>(R.id.encontrandoAWally)
        val recycler = view.findViewById<RecyclerView>(R.id.recyclerViewCompra)
        val opps = view.findViewById<TextView>(R.id.title_ups_lista)


        if (recetas.size == 0){
            recycler.visibility = View.GONE
            wally.visibility = View.VISIBLE
            opps.visibility = View.VISIBLE
        }
        else{
            opps.visibility = View.GONE
            recycler.visibility = View.VISIBLE
            wally.visibility = View.GONE
        }

        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerCompra()

    }

    fun initRecyclerCompra(){
        recyclerViewCompra.layoutManager = LinearLayoutManager(activity)
        val adapter = ListaCompraAdapter(recetas)
        recyclerViewCompra.adapter = adapter
    }

}