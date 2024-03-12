package com.dicoding.fruits.fruits

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.fruits.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FruitsAdapter(private val listFruits: ArrayList<Fruits>) : RecyclerView.Adapter<FruitsAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
       val view: View = LayoutInflater
           .from(viewGroup.context)
           .inflate(R.layout.layout_fruits, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFruits.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val fruits =listFruits[position]

        Glide.with(holder.itemView.context)
            .load(fruits.image)
            .apply(RequestOptions().override(50, 50))
            .into(holder.imgPhoto)

        holder.tvName.text = fruits.name
        holder.tvSpecies.text = fruits.species

        val context = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(context, FruitsDetail::class.java)
            moveDetail.putExtra(FruitsDetail.EXTRA_NAME, fruits.name)
            moveDetail.putExtra(FruitsDetail.EXTRA_IMAGE, fruits.image)
            moveDetail.putExtra(FruitsDetail.EXTRA_SPECIES, fruits.species)
            moveDetail.putExtra(FruitsDetail.EXTRA_DETAIL, fruits.detail)
            moveDetail.putExtra(FruitsDetail.EXTRA_OVERVIEW, fruits.overview)
            context.startActivity(moveDetail)
        }

    }
    inner class ListViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_fruits_name)
        var tvSpecies: TextView = itemView.findViewById(R.id.tv_fruits_species)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_fruits_image)
    }

}