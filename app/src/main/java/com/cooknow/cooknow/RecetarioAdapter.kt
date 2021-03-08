package com.cooknow.cooknow

import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.cooknow.cooknow.classes.Receta
import kotlinx.android.synthetic.main.recetario_item.view.*


class RecetarioAdapter(val receta: List<Receta>):RecyclerView.Adapter<RecetarioAdapter.RecetarioHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetarioHolder {
        val layoutInflaterRecetario = LayoutInflater.from(parent.context)
        return RecetarioHolder(
            layoutInflaterRecetario.inflate(
                R.layout.recetario_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return receta.size
    }

    override fun onBindViewHolder(holder: RecetarioHolder, position: Int) { // MUY importante, funcion para redirigir
        holder.render(receta[position])
        holder.view.receta_boton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val mediaStreamIntent = Intent(holder.view.context, RegisterActivity::class.java)
                holder.view.context.startActivity(mediaStreamIntent)
            }
        })
    }


    class RecetarioHolder(val view: View):RecyclerView.ViewHolder(view){

        fun render(receta: Receta){
            view.nombreReceta.text = receta.getNombre()
            view.imgReceta.setImageDrawable(ContextCompat.getDrawable(view.context, receta.getImagen()))
        }
    }

}