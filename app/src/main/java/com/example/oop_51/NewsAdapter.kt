package com.example.oop_51

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val story: ArrayList<News>, val context: Context): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.avatar.setImageBitmap(story[position].avatar)
        holder.name.text = story[position].name
        holder.topic.text = story[position].topic
        holder.description.text = story[position].description
    }
    override fun getItemCount(): Int {
        return story.size
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val avatar = itemView.rootView.findViewById<ImageView>(R.id.ivAvatar)
    val name = itemView.rootView.findViewById<TextView>(R.id.tvName)
    val topic = itemView.rootView.findViewById<TextView>(R.id.tvTopic)
    val description = itemView.rootView.findViewById<TextView>(R.id.tvDescription)
}