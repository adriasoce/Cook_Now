package com.cooknow.cooknow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.cooknow.cooknow.classes.RecetaKt
import kotlinx.android.synthetic.main.receta_item.view.*

class DiarioAdapter(val receta:MutableList<RecetaKt>):RecyclerView.Adapter<DiarioAdapter.DiarioHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiarioHolder {
        val layoutInflaterDiario = LayoutInflater.from(parent.context)
        return DiarioHolder(layoutInflaterDiario.inflate(R.layout.receta_item, parent, false))
    }


    override fun getItemCount(): Int {
        return receta.size
    }

    override fun onBindViewHolder(holder: DiarioHolder, position: Int) {
        holder.render(receta[position])
        holder.view.botonRechazar.setOnClickListener(object : View.OnClickListener {

            override fun onClick(view:View){
                receta.removeAt(position)
                notifyItemRemoved(position)
                notifyItemRangeChanged(position, receta.size)
            }
        })
    }


    class DiarioHolder(val view:View):RecyclerView.ViewHolder(view){



        fun render(receta: RecetaKt){
            view.nombreReceta.text = receta.getNombre()
            view.descripcionReceta.text = receta.getDescripcion()
            view.duracionReceta.text = receta.getDuracion()
            view.personasReceta.text = receta.getPersonas()
            view.dificultadReceta.numStars = receta.getDificultad()
            view.popularidadReceta.text = receta.getPopularidad()
        }



    }

}