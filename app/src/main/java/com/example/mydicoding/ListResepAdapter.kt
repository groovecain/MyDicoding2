package com.example.mydicoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListResepAdapter(private val ResepData: ArrayList<Resep>) : RecyclerView.Adapter<ListResepAdapter.ListViewHold>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHold {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_main, viewGroup, false)
        return ListViewHold(view)
    }

    override fun getItemCount(): Int {
        return ResepData.size
    }

    override fun onBindViewHolder(holder: ListViewHold, position: Int) {
        val (namaResep, descResep, foodPhotos, sumber, bahan, resepDo) = ResepData[position]
        Glide.with(holder.itemView.context)
            .load(foodPhotos)
            .apply(RequestOptions().override(55, 55))
            .into(holder.img_food_photos)
        holder.resep_name.text = namaResep
        holder.sumber_text.text = sumber
        holder.resep_text.text = descResep

    }

    inner class ListViewHold(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var resep_name: TextView = itemView.findViewById(R.id.resep_name)
        var sumber_text: TextView = itemView.findViewById(R.id.sumber_text)
        var resep_text: TextView = itemView.findViewById(R.id.resep_text)
        var img_food_photos: ImageView = itemView.findViewById(R.id.img_food_photos)

    }
}