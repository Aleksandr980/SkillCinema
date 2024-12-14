package com.example.skillcinema.presentation.filmpageFragment.gallery

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.GalleryItemBinding
import com.example.skillcinema.entity.gallery.Gallery


class GalleryListAdapter (
    private val onClick: (position: Int, hash: Int) -> Unit
) : ListAdapter<Gallery, GalleryViewHolder>(DiffUtilCallback2()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        return GalleryViewHolder(
            GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {

        val item = getItem(position)
        Log.d("GalleryListAdapter", "GalleryListAdapter getItem $item")

        holder.binding.root.setOnClickListener {
            onClick.invoke(position, this.hashCode())
            Log.d("GalleryListAdapter", "GalleryListAdapter   holder.binding.root.setOnClickListener $it")
        }


        with(holder.binding) {
            item?.let {
                Glide
                    .with(poster.context)
                    .load(it.imageUrl)
                    .into(poster)
            }
        }
    }
}

class DiffUtilCallback2 : DiffUtil.ItemCallback<Gallery>() {

    override fun areItemsTheSame(oldItem: Gallery, newItem: Gallery): Boolean =
        oldItem.previewUrl == newItem.previewUrl

    override fun areContentsTheSame(oldItem: Gallery, newItem: Gallery): Boolean =
        oldItem == newItem
}

class GalleryViewHolder(val binding: GalleryItemBinding): RecyclerView.ViewHolder(binding.root)