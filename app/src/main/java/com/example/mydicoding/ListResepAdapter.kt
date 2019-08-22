package com.example.mydicoding


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions

class ListResepAdapter(private val ResepData: ArrayList<Resep>) : RecyclerView.Adapter<ListResepAdapter.ListViewHold>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHold {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_main, viewGroup, false)
        return ListViewHold(view)
    }
    override fun getItemCount(): Int {
        return ResepData.size
    }
    override fun onBindViewHolder(holder: ListViewHold, position: Int) {
        val (resepName, resepSource, resepDesc, resepIng, resepDo, resepPhoto) = ResepData[position]
        Glide.with(holder.itemView.context)
            .load(resepPhoto)
            .apply(RequestOptions()
                .format(DecodeFormat.PREFER_ARGB_8888))
            .into(holder.resepPhoto)
        holder.resepName.text = resepName
        holder.resepSource.text = resepSource
        holder.resepDesc.text = resepDesc
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(holder.adapterPosition) }
    }
    inner class ListViewHold(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var resepName: AppCompatTextView = itemView.findViewById(R.id.resepName)
        var resepSource: AppCompatTextView = itemView.findViewById(R.id.resepSource)
        var resepDesc: AppCompatTextView = itemView.findViewById(R.id.resepDesc)
        var resepPhoto: ImageView = itemView.findViewById(R.id.resepPhoto)

    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Int)
    }
}


