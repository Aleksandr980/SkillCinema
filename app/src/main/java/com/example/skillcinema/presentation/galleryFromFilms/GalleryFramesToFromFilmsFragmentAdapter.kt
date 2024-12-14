package com.example.skillcinema.presentation.galleryFromFilms

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.GalleryItemBinding
import com.example.skillcinema.entity.gallery.Gallery

class GalleryFramesToFromFilmsFragmentAdapter (
    private val onClick: (position: Int, hash: Int) -> Unit
) : ListAdapter<Gallery, GalleryFramesToFromFilmsFragmentViewHolder>(DiffUtilCallback3()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryFramesToFromFilmsFragmentViewHolder {
        return GalleryFramesToFromFilmsFragmentViewHolder(
            GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: GalleryFramesToFromFilmsFragmentViewHolder, position: Int) {
        val item = getItem(position)
        Log.d("GalleryFramesToFromFilmsFragmentAdapter", "GalleryFramesToFromFilmsFragmentAdapter getItem $item")
        holder.binding.root.setOnClickListener {
            onClick.invoke(position, this.hashCode())
            Log.d("GalleryFramesToFromFilmsFragmentAdapter", "GalleryFramesToFromFilmsFragmentAdapter   holder.binding.root.setOnClickListener $it")
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
class GalleryFramesToFromFilmsFragmentViewHolder(val binding: GalleryItemBinding): RecyclerView.ViewHolder(binding.root)