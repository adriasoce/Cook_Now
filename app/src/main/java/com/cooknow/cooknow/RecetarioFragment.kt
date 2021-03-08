package com.cooknow.cooknow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.cooknow.cooknow.classes.Receta
import kotlinx.android.synthetic.main.fragment_recetario.*


class RecetarioFragment : Fragment() {

    //var adapter: FoodAdapter? = null
    var foodList: List<Receta> = listOf(
        Receta(1,"Spaghetti", R.drawable.ic_recetario, "", "", "", 1, mutableListOf(), mutableListOf(), "", false),
        Receta(2, "Tortilla Francesa", R.drawable.ic_recetario, "", "", "", 2, mutableListOf(), mutableListOf(), "", false),
        Receta(3, "Pizza margharita", R.drawable.ic_recetario, "", "", "", 2, mutableListOf(), mutableListOf(), "", false),
        Receta(4, "Arroz con tomate", R.drawable.ic_recetario, "", "", "", 3, mutableListOf(), mutableListOf(), "", false),
        Receta(5, "Pechuga de pollo", R.drawable.ic_recetario, "", "", "", 2, mutableListOf(), mutableListOf(), "", false),
        Receta(6, "Pollo de Sichuan", R.drawable.ic_recetario, "", "", "", 3, mutableListOf(), mutableListOf(), "", false)
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