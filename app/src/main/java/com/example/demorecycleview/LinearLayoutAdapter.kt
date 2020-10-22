package com.example.demorecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LinearLayoutAdapter(val musicList: ArrayList<Music>) :
    RecyclerView.Adapter<LinearLayoutAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val music:Music=musicList[position]
        holder.textViewSingle.text=music.mname
        holder.textViewSong.text=music.msong
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewSingle=itemView.findViewById(R.id.tencs) as TextView
        val textViewSong=itemView.findViewById(R.id.tenbh) as TextView
    }
}