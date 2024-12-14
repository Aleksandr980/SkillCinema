package com.example.skillcinema.presentation.filmpageFragment.main_poster

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.MainPosterItemBinding
import com.example.skillcinema.entity.mainPosteer.MainPoster


class MainPosterListAdapter(
    private val onClickPosterMain: (position: Int, hash: Int) -> Unit
) : ListAdapter<MainPoster, MainPosterViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainPosterViewHolder {
        return MainPosterViewHolder(
            MainPosterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: MainPosterViewHolder, position: Int) {

        val item = getItem(position)
        Log.d("MainPosterListAdapter", "MainPosterListAdapter getItem $item")


        holder.binding.root.setOnClickListener {
            onClickPosterMain.invoke(position, this.hashCode())
            Log.d("MainPosterListAdapter", "MainPosterListAdapter   holder.binding.root.setOnClickListener $it")
        }

        with(holder.binding) {
                 item?.let {
                    Glide
                        .with(posterMain.context)
                        .load(it.imageUrl)
                        .into(posterMain)
                }

        }
    }


}

class DiffUtilCallback : DiffUtil.ItemCallback<MainPoster>() {

    override fun areItemsTheSame(oldItem: MainPoster, newItem: MainPoster): Boolean =
        oldItem.previewUrl == newItem.previewUrl

    override fun areContentsTheSame(oldItem: MainPoster, newItem: MainPoster): Boolean =
        oldItem == newItem
}

class MainPosterViewHolder(val binding: MainPosterItemBinding) :
    RecyclerView.ViewHolder(binding.root)