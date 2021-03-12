package com.cooknow.cooknow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cooknow.cooknow.classes.Receta
import com.cooknow.cooknow.classes.Recetario
import kotlinx.android.synthetic.main.compra_item.view.*

class ListaCompraAdapter(val receta:MutableList<Receta>): RecyclerView.Adapter<ListaCompraAdapter.ListaCompraHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaCompraHolder {
        val layoutInflaterCompra = LayoutInflater.from(parent.context)
        return ListaCompraHolder(layoutInflaterCompra.inflate(R.layout.compra_item, parent, false))
    }


    override fun getItemCount(): Int {
        return receta.size
    }

    override fun onBindViewHolder(holder: ListaCompraHolder, position: Int) {
        holder.render(receta[position])
        holder.view.botonNoCompra.setOnClickListener {
            Recetario().quitarListaCompra(receta[position])
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, receta.size)
        }
    }


    class ListaCompraHolder(val view: View): RecyclerView.ViewHolder(view){

        fun render(receta: Receta){
            view.nombreCompra.text = receta.getNombre()
            view.checkCompra.isChecked = false
            view.ingredientesCompra.text = receta.getStringIngredientes()
        }


    }

}