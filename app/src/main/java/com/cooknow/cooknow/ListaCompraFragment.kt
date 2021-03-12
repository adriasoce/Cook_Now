package com.cooknow.cooknow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
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


        // IMPLEMENT

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