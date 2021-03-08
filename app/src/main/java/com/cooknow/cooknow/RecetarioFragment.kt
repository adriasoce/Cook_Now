package com.cooknow.cooknow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView.*
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cooknow.cooknow.classes.Receta
import kotlinx.android.synthetic.main.fragment_recetario.*


class RecetarioFragment : Fragment() {

    //var adapter: FoodAdapter? = null
    var foodList: List<Receta> = listOf(
        Receta("Spaghetti", R.drawable.ic_recetario, "", "", "", "", 1),
        Receta("Tortilla Francesa", R.drawable.ic_recetario, "", "", "", "", 1),
        Receta("Pizza margharita", R.drawable.ic_recetario, "", "", "", "", 1),
        Receta("Arroz con tomate", R.drawable.ic_recetario, "", "", "", "", 1),
        Receta("Pechuga de pollo", R.drawable.ic_recetario, "", "", "", "", 1),
        Receta("Pollo de Sichuan", R.drawable.ic_recetario, "", "", "", "", 1),
        Receta("Tortellini", R.drawable.ic_recetario, "", "", "", "", 1),
        Receta("Empanadas", R.drawable.ic_recetario, "", "", "", "", 1),
        Receta("Bistec de ternera", R.drawable.ic_recetario, "", "", "", "", 1),
        Receta("Cerezas confitadas", R.drawable.ic_recetario, "", "", "", "", 1)
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recetario, container, false)
        // IMPLEMENT

        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Recetario"
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerRecetario()
    }

    fun initRecyclerRecetario(){
        //recyclerView2.layoutManager = LinearLayoutManager(activity)
        recyclerView2.layoutManager = GridLayoutManager(activity, 3)
        val adapter = RecetarioAdapter(foodList)
        recyclerView2.adapter = adapter
    }
}