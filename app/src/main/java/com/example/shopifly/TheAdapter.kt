package com.example.shopifly

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class TheAdapter(val context: Context, val dataSet:List<ItemModel>) :
    Adapter<TheAdapter.ItemAdapter>(){

    class ItemAdapter(itemView: View): RecyclerView.ViewHolder(itemView){
        val img :ImageView = itemView.findViewById(R.id.Img)
        val itemtype :TextView = itemView.findViewById(R.id.Type)
        val itemprice :TextView = itemView.findViewById(R.id.Price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter {
        val layoutView = LayoutInflater.from(parent.context).inflate(
            R.layout.item,
            parent,
            false
        )
        return ItemAdapter(layoutView)
    }

    override fun onBindViewHolder(holder: ItemAdapter, position: Int) {
        val item = dataSet[position]
        holder.img.setImageResource(item.img)
        holder.itemtype.text = context.resources.getString(item.type)
        holder.itemprice.text = context.resources.getString(item.price)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}