package com.cooknow.cooknow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.cooknow.cooknow.classes.Recetario
import kotlinx.android.synthetic.main.fragment_recetario.*


class RecetarioFragment : Fragment() {

    //var adapter: FoodAdapter? = null
    var foodList: List<Recetario> = listOf(
        Recetario("cuadraditos", R.drawable.ic_recetario),
        Recetario("persona a la brasa", R.drawable.ic_perfil) ,
        Recetario("cuadraditos", R.drawable.ic_recetario),
        Recetario("persona a la brasa", R.drawable.ic_perfil),
        Recetario("persona a la brasa", R.drawable.ic_perfil) ,
        Recetario("cuadraditos", R.drawable.ic_recetario),
        Recetario("persona a la brasa", R.drawable.ic_perfil)
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