package com.example.skillcinema.presentation.seachFragment

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.skillcinema.R

class SeachFoundAdapter(
    private val onClick: (position: Int, hash: Int) -> Unit):
    RecyclerView.Adapter<SeachFoundAdapter.ViewHolder>() {

    private var selectedPosition = RecyclerView.NO_POSITION

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button: Button = itemView.findViewById(R.id.button_seach) ?: throw IllegalArgumentException("Button not found in layout")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.button_seach, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, @SuppressLint("RecyclerView") position: Int) {

        val name1 = "Все"
        val name2 = "Фильмы"
        val name3 = "Сериалы"

        when (position) {
            0 -> {
                selectedPosition = position
                holder.button.text = name1
                holder.button.setBackgroundColor(selectedPosition)

            }

            1 -> {
                holder.button.text = name2

            }

            2 -> {
                holder.button.text = name3

            }
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
