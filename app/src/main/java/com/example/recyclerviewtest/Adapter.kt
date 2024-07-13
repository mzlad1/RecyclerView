package com.example.recyclerviewtest
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val data: Array<Pair<Int, String>>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (imageRes, text) = data[position]
        holder.imageView.setImageResource(imageRes)
        holder.textView.text = text
    }

    override fun getItemCount() = data.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ShapeableImageView = view.findViewById(R.id.imageView)
        val textView: TextView = view.findViewById(R.id.textView)

    }
}
