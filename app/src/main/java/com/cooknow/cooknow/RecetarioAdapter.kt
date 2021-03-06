package com.cooknow.cooknow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.cooknow.cooknow.classes.Recetario
import kotlinx.android.synthetic.main.recetario_item.view.*

class RecetarioAdapter(val receta:List<Recetario>):RecyclerView.Adapter<RecetarioAdapter.RecetarioHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetarioHolder {
        val layoutInflaterRecetario = LayoutInflater.from(parent.context)
        return RecetarioHolder(layoutInflaterRecetario.inflate(R.layout.recetario_item, parent, false))
    }


    override fun getItemCount(): Int {
        return receta.size
    }

    override fun onBindViewHolder(holder: RecetarioHolder, position: Int) {
        holder.render(receta[position])
    }

    class RecetarioHolder(val view:View):RecyclerView.ViewHolder(view){

        fun render(receta: Recetario){
            view.nombreReceta.text = receta.getnombre()
            //view.imgReceta = receta.getimagen()
        }
    }

}