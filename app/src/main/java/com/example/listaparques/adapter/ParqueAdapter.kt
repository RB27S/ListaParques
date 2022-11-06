package com.example.listaparques.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listaparques.Parque
import com.example.listaparques.R

class ParqueAdapter(private val ListaParques:List<Parque>) : RecyclerView.Adapter<ParqueViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParqueViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ParqueViewHolder(layoutInflater.inflate(R.layout.item_parque, parent, false))
    }

    override fun onBindViewHolder(holder: ParqueViewHolder, position: Int) {
        val item = ListaParques[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return ListaParques.size
    }
}