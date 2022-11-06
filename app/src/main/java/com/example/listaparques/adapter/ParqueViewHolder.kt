package com.example.listaparques.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listaparques.Parque
import com.example.listaparques.databinding.ItemParqueBinding

class ParqueViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemParqueBinding.bind(view)

    fun render(parqueModel: Parque) {
        binding.nombreParque.text = parqueModel.nombre
        binding.descripcionParque.text = parqueModel.descripcion
        Glide.with(binding.imagenParque.context).load(parqueModel.enlaceImagen).into(binding.imagenParque)

        //Configuración de un ClickListener para toda la tarjeta
        itemView.setOnClickListener{Toast.makeText(binding.imagenParque.context, parqueModel.nombre, Toast.LENGTH_SHORT).show()}
    }
}