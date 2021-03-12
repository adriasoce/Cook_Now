package com.cooknow.cooknow

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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

        foodList = Recetario().getRecetario(true)

        val canelonesATope = view.findViewById<SearchView>(R.id.buscarCanelones)
        canelonesATope.onActionViewExpanded()
        canelonesATope.clearFocus()

        canelonesATope.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                if (newText.equals("")){
                    foodList = Recetario().getRecetario(true)
                }
                else{
                    foodList = Recetario().search(newText!!)
                }

                initRecyclerRecetario()

                return false
            }
        })

        return view
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
