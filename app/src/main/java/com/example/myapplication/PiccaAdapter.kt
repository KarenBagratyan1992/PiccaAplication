package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.namespace.R

class PiccaAdapter(private val context: Context, val data: List<RowData>) :
    RecyclerView.Adapter<PiccaAdapter.CustomViewHolder>() {


    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = from(context).inflate(R.layout.rowdata, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentData = data[position]
        holder.namePizza.text = currentData.namePizza
        holder.nameRestourant.text = currentData.nameRestaurant
        holder.imgBasket.setImageResource(currentData.imgBasket)
        holder.imgHeart.setImageResource(currentData.imgHeart)
        holder.imgPizza.setImageResource(currentData.imgPizza)

    }

    override fun getItemCount(): Int {
        return data.size
    }


    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgPizza: ImageView
        val imgHeart: ImageView
        val imgBasket: ImageView
        val namePizza: TextView
        val nameRestourant: TextView

        init {
            imgPizza = view.findViewById(R.id.imgPizza)
            imgHeart = view.findViewById(R.id.imgHeart)
            imgBasket = view.findViewById(R.id.imgBasket)
            nameRestourant = view.findViewById(R.id.nameRestaurant)
            namePizza = view.findViewById(R.id.namePizza)
        }
    }
}