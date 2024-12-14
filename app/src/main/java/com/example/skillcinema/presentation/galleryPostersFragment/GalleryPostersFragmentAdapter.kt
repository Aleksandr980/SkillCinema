package com.example.skillcinema.presentation.galleryPostersFragment

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.MainPosterItemBinding
import com.example.skillcinema.entity.mainPosterGallery.MainPosterGallery


class GalleryPostersFragmentAdapter (
    private val onClick: (position: Int, hash: Int) -> Unit
) : ListAdapter<MainPosterGallery, GalleryPostersFragmentViewHolder>(DiffUtilCallback3()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryPostersFragmentViewHolder {
        return GalleryPostersFragmentViewHolder(
            MainPosterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: GalleryPostersFragmentViewHolder, position: Int) {
        val item = getItem(position)
        Log.d("GalleryPostersFragmentAdapter", "GalleryPostersFragmentAdapter getItem $item")
        holder.binding.root.setOnClickListener {
            onClick.invoke(position, this.hashCode())
            Log.d("GalleryPostersFragmentAdapter", "GalleryPostersFragmentAdapter   holder.binding.root.setOnClickListener $it")
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
class DiffUtilCallback3 : DiffUtil.ItemCallback<MainPosterGallery>() {
    override fun areItemsTheSame(oldItem: MainPosterGallery, newItem: MainPosterGallery): Boolean =
        oldItem.previewUrl == newItem.previewUrl
    override fun areContentsTheSame(oldItem: MainPosterGallery, newItem: MainPosterGallery): Boolean =
        oldItem == newItem
}
class GalleryPostersFragmentViewHolder(val binding: MainPosterItemBinding): RecyclerView.ViewHolder(binding.root)