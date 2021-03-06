package com.cooknow.cooknow

import android.os.Bundle
import android.util.Log // debug purposes
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cooknow.cooknow.classes.Recetario

class RecetarioFragment : Fragment() {

    //var adapter: FoodAdapter? = null
    var foodList = ArrayList<Recetario>()

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

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        //load food
        foodList.add(Recetario("1", R.drawable.ic_diario))
        foodList.add(Recetario("2", R.drawable.ic_cooking))
        foodList.add(Recetario("3", R.drawable.ic_perfil))

    }
}