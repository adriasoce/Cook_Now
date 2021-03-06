package com.cooknow.cooknow

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.cooknow.cooknow.classes.Recetario

data class RecetarioAdapter(val foodlist: ArrayList<Recetario>, val varactivity: Activity) : BaseAdapter() {

    override fun getItem(position: Int): Any {
        return foodlist.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        return foodlist.size
    }

//    override fun getView(
//        position: Int,
//        convertView: View?,
//        parent: ViewGroup?,
//        inflater: LayoutInflater,
//        container: ViewGroup?
//    ): View {
//        val view = inflater.inflate(R.layout.fragment_recetario, container, false)
//
//        val valtv_num = view.findViewById<TextView>(R.id.tv_number) as TextView
//        val valtv_lang = view.findViewById<TextView>(R.id.tv_lang) as TextView
//        val valimg_lang = view.findViewById<ImageView>(R.id.im_lang)
//
//
//        val tv_num.text = (position+1).toString()+"."
//        val tv_lang.text = foodlist.get(position).name
//        val vallang_pic = foodlist.get(position).img_icon
////img_lang.drawable =langaugeList.get(position).img_icon
//        val img_lang.setImageResource(lang_pic)
//
//        return view
//    }

}