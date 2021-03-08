package com.cooknow.cooknow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cooknow.cooknow.classes.OverlappingDecoration
import com.cooknow.cooknow.classes.RecetaKt
import kotlinx.android.synthetic.main.fragment_diario.*
import kotlinx.android.synthetic.main.fragment_lista_compra.*


class ListaCompraFragment : Fragment() {

    var recetas: MutableList<RecetaKt> = mutableListOf(
        RecetaKt("Tortilla de patatas", "x", "Esta receta viene de España y ha ganado mucha popularidad porque y...", "20", "10 minutos", "2 comensales", 3),
        RecetaKt("Macarrones", "71", "Esta de Italia x y lo hace todo el mundo porque es facil...", "20", "6 minutos", "3 comensales", 4),
        RecetaKt("Pizza 4 quesos", "4", "Esta receta viene de EEUU y ha ganado mucha popularidad porque y lo han vendido muy bien por todo el mundo, no toma mucho tiempo y esta muy buena. Creemos que te podria encantar. muchos animos...", "20", "15 minutos", "5 comensales", 5),
        RecetaKt("Ensalada", "8", "Esta receta es universal y ha ganado mucha popularidad estos ultimos añosporque y", "20", "8 minutos", "1 comensal", 1),
        RecetaKt("Arroz con pollo", "2", "Esta de Colombia x y lo hace todo el mundo porque es facil y sano para mejorar la condicion fisica. Preparala ya", "20", "20 minutos", "3 comensales", 3),
        RecetaKt("Fideos", "Paso 1", "Esta receta viene de Japon y ha ganado mucha popularidad porque y lo han vendido muy bien por todo el mundo, no toma mucho tiempo y esta muy buena. Creemos que", "20", "40 minutos", "2 comensales", 2),
        RecetaKt("Paella", "Paso 1", "Reseta clasica de España que deberia probar todo el mundo. Tomara mucho tiempo", "20", "80 minutos", "8 comensales", 4),
        RecetaKt("Pastel de chocolate", "Paso 1", "Un postre de chocolate para celebrar en una fiesta", "20", "25 minutos", "5 comensales", 1)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_lista_compra, container, false)


        (activity as AppCompatActivity?)!!.title = "Lista de la compra"


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