package com.example.skillcinema.presentation.galleryFramesFragment

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.GalleryItemBinding
import com.example.skillcinema.entity.gallery.Gallery

class GalleryFramesFragmentAdapter (
    private val onClick: (position: Int, hash: Int) -> Unit
) : ListAdapter<Gallery, GalleryFramesFragmentViewHolder>(DiffUtilCallback3()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryFramesFragmentViewHolder {
        return GalleryFramesFragmentViewHolder(
            GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: GalleryFramesFragmentViewHolder, position: Int) {
        val item = getItem(position)
        Log.d("GalleryFramesFragmentAdapter", "GalleryFramesFragmentAdapter getItem $item")
        holder.binding.root.setOnClickListener {
            onClick.invoke(position, this.hashCode())
            Log.d("GalleryFramesFragmentAdapter", "GalleryFramesFragmentAdapter   holder.binding.root.setOnClickListener $it")
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
class DiffUtilCallback3 : DiffUtil.ItemCallback<Gallery>() {
    override fun areItemsTheSame(oldItem: Gallery, newItem: Gallery): Boolean =
        oldItem.previewUrl == newItem.previewUrl
    override fun areContentsTheSame(oldItem: Gallery, newItem: Gallery): Boolean =
        oldItem == newItem
}
class GalleryFramesFragmentViewHolder(val binding: GalleryItemBinding): RecyclerView.ViewHolder(binding.root)