package com.example.skillcinema.presentation.seachFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skillcinema.databinding.ItemYearBinding


class YearAdapter(
    private val yearList: ArrayList<Int>,
    val onItemClick: (Int) -> Unit
) : RecyclerView.Adapter<YearAdapter.YearViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YearViewHolder {
        return YearViewHolder(
            ItemYearBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: YearViewHolder, position: Int) {

        val year = yearList[position]
        holder.binding.textViewYear.text = year.toString()
    }

    override fun getItemCount(): Int {
        return yearList.size
    }

    inner class YearViewHolder(val binding: ItemYearBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onItemClick(yearList[bindingAdapterPosition])
            }
        }

    }
}
