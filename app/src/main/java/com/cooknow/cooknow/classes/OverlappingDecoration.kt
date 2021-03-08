package com.cooknow.cooknow.classes

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class OverlappingDecoration : RecyclerView.ItemDecoration(){

    private val overlappingValue = -1100

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.set(0,0,0,overlappingValue)
    }

}