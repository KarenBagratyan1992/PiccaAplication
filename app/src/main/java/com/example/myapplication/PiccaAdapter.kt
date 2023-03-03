package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.navigation.Navigation

import androidx.recyclerview.widget.RecyclerView

import com.example.namespace.R
import okhttp3.internal.notify


class PiccaAdapter(private val context: Context, val data: List<RowData>) :RecyclerView.Adapter<PiccaAdapter.CustomViewHolder>()
{


    var bandl = Bundle()
    var heartVizibilityListener: ((RowData) -> Unit)? = null
    var basketListener: ((RowData) -> Unit)? = null
    var itemListener: ((RowData) -> Unit)? = null
//    var itemremoveListener:((RowData)->Unit)?=null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = from(context).inflate(R.layout.rowdata, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentData = data[position]
        holder.namePizza.text = currentData.namePizza
        holder.nameRestourant.text = currentData.nameRestaurant
        holder.imgBasket.setImageResource(currentData.imgBasket)
        holder.imgHeartin.setImageResource(currentData.imgHeart)
        holder.imgPizza.setImageResource(currentData.imgPizza)
        holder.imgHeartin.setOnClickListener {
            heartVizibilityListener?.invoke(currentData)
            holder.imgHeartin.setImageResource(R.drawable.heart)}

         holder.itemView.setOnLongClickListener {
                itemListener?.invoke(currentData)
                when(position)
                {
                    1->Navigation.findNavController(it).navigate(R.id.action_fragmentPizza_to_secondFragmentPicca)
                    2->Navigation.findNavController(it).navigate(R.id.action_fragmentPizza_to_theerdFragmentPicca)
                    3->Navigation.findNavController(it).navigate(R.id.action_fragmentPizza_to_fourthFragmentPicca)



                }
                return@setOnLongClickListener true


        }

        holder.imgBasket.setOnClickListener {
            basketListener?.invoke(currentData)

            bandl.putParcelable(KEY_FOR_BUNDLE, currentData)


        }
//        holder.itemView.setOnClickListener {
//            itemremoveListener?.invoke(currentData)
//        }

    }

    override fun getItemCount(): Int {
        return data.size
    }


    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgPizza: ImageView
        val imgHeartin: ImageView
        val imgBasket: ImageView
        val namePizza: TextView
        val nameRestourant: TextView


        init {
            imgPizza = view.findViewById(R.id.imgPizza)
            imgHeartin = view.findViewById(R.id.imgHeart)
            imgBasket = view.findViewById(R.id.imgBasket)
            nameRestourant = view.findViewById(R.id.nameRestaurant)
            namePizza = view.findViewById(R.id.namePizza)
        }
    }

    companion object {
        const val KEY_FOR_BUNDLE = "key"
        const val VALUE_FOR_BUNDLE = "value"
    }
//    fun addElement(item:RowData){
//        data.add(item)
//    }
//    fun removeElement(pos: Int){
//
//         notify()
//    }

}
