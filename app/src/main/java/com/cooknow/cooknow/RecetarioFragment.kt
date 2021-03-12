package com.cooknow.cooknow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.cooknow.cooknow.classes.Pasos
import com.cooknow.cooknow.classes.Receta
import com.cooknow.cooknow.classes.Recetario
import kotlinx.android.synthetic.main.fragment_recetario.*


class RecetarioFragment : Fragment() {

    //var adapter: FoodAdapter? = null
    var foodList: List<Receta> = Recetario().getRecetario(true)



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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity?)!!.title = "Recetario"
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerRecetario()
    }

    fun initRecyclerRecetario(){
        //recyclerView2.layoutManager = LinearLayoutManager(activity)
        recyclerView2.layoutManager = GridLayoutManager(activity, 2)
        val adapter = RecetarioAdapter(foodList)
        recyclerView2.adapter = adapter
    }
}