package com.cooknow.cooknow

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.cooknow.cooknow.classes.Receta
import kotlinx.android.synthetic.main.fragment_diario.view.*
import kotlinx.android.synthetic.main.receta_item.view.*

class DiarioAdapter(val receta:MutableList<Receta>):RecyclerView.Adapter<DiarioAdapter.DiarioHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiarioHolder {
        val layoutInflaterDiario = LayoutInflater.from(parent.context)
        return DiarioHolder(layoutInflaterDiario.inflate(R.layout.receta_item, parent, false))
    }


    override fun getItemCount(): Int {
        return receta.size
    }

    override fun onBindViewHolder(holder: DiarioHolder, position: Int) {
        holder.render(receta[position])



        holder.view.botonRechazar.setOnClickListener {

            receta[position].setDescartada(true)
            receta.removeAt(position)

            notifyItemRemoved(position)
            notifyItemRangeChanged(position, receta.size)

        }

        holder.view.botonCocinar.setOnClickListener {

            val mediaStreamIntent = Intent(holder.view.context, RecetaActivity::class.java)
            mediaStreamIntent.putExtra("Receta", receta[position].getId())
            holder.view.context.startActivity(mediaStreamIntent)
        }
    }


    class DiarioHolder(val view:View):RecyclerView.ViewHolder(view){



        fun render(receta: Receta){
            view.nombreReceta.text = receta.getNombre()
            view.imgReceta.setImageDrawable(ContextCompat.getDrawable(view.context, receta.getImagen()))
            view.descripcionReceta.text = receta.getDescripcion()
            view.duracionReceta.text = receta.getDuracion()
            view.personasReceta.text = receta.getRaciones()
            view.infoDificultad.text = receta.dificultadStars()
        }



    }

}