package com.example.lanavia.pruebaemulador

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_row.view.*


class MainAdapter:RecyclerView.Adapter<CustomViewHolder>(){

    val rowsOfLayout = listOf<Movie>(Movie("Rápido y furioso", 2001),
        Movie("el padrino", 1972),
        Movie("Sueños de libertad", 1994),
        Movie("Forrest gump", 1994)
    )

    override fun getItemCount(): Int {
        return rowsOfLayout.size

     }


    override fun onCreateViewHolder(parentGroup: ViewGroup, p1: Int): CustomViewHolder {
        //cuando creamos la vista
        //inflamos el elemento
        val layoutInflater = LayoutInflater.from(parentGroup.context)
        val cellForRow = layoutInflater.inflate(R.layout.layout_row, parentGroup,false)
        return CustomViewHolder(cellForRow)

    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        val row = rowsOfLayout.get(p1)
        p0?.itemView?.txtTitle?.text = "${row.nameMovie} - ${row.year}"   }

}


class CustomViewHolder(v:View): RecyclerView.ViewHolder(v){

}