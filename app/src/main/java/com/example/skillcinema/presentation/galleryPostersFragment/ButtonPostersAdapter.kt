package com.example.skillcinema.presentation.galleryPostersFragment

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.skillcinema.R


class ButtonPostersAdapter(
    private var count1: Int,
    private var count3: Int,
    private val onClick: (position: Int, hash: Int) -> Unit):
    RecyclerView.Adapter<ButtonPostersAdapter.ViewHolder>() {

    private var selectedPosition = RecyclerView.NO_POSITION

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button: Button = itemView.findViewById(R.id.button_text_gallery) ?: throw IllegalArgumentException("Button not found in layout")
        val count: TextView = itemView.findViewById(R.id.count_buttom_gallery) ?: throw IllegalArgumentException("Count TextView not found in layout")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.button_white_gallery_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, @SuppressLint("RecyclerView") position: Int) {

        val name1 = "Кадры"
        val name2 = "Со съёмок"
        val name3 = "Постеры"

        val count2 = 0



        when (position) {
            0 -> {
                holder.button.text = name1
                holder.count.text = "$count1"
            }

            1 -> {
                holder.button.text = name2
                holder.count.text = "$count2"
            }

            2 -> {
                selectedPosition = position
                holder.button.text = name3
                holder.count.text = "$count3"
                holder.button.setBackgroundColor(selectedPosition)
            }
        }

        holder.count.apply {
            setTextColor(
                if (selectedPosition == position) ContextCompat.getColor(context, R.color.white)
                else ContextCompat.getColor(context, R.color.black)
            )
        }

        holder.button.apply {
            setBackgroundColor(
                if (selectedPosition == position) ContextCompat.getColor(context, R.color.indigo)
                else ContextCompat.getColor(context, R.color.white)
            )
            setTextColor(
                if (selectedPosition == position) ContextCompat.getColor(context, R.color.white)
                else ContextCompat.getColor(context, R.color.black)
            )

            setOnClickListener {
                onClick.invoke(position, this.hashCode())
                val previousSelected = selectedPosition
                if (selectedPosition != position) {
                    selectedPosition = position
                    notifyItemChanged(previousSelected)
                    notifyItemChanged(position)
                }
            }
        }
    }
    override fun getItemCount(): Int {
        return 3
    }
}
