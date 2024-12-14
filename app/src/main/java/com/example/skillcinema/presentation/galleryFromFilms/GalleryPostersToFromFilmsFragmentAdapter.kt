package com.example.skillcinema.presentation.galleryFromFilms

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.MainPosterItemBinding
import com.example.skillcinema.entity.mainPosterGallery.MainPosterGallery
import com.example.skillcinema.presentation.galleryPostersFragment.GalleryPostersFragmentViewHolder

class GalleryPostersToFromFilmsFragmentAdapter (
    private val onClick: (position: Int, hash: Int) -> Unit
) : ListAdapter<MainPosterGallery, GalleryPostersFragmentViewHolder>(DiffUtilCallback5()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryPostersFragmentViewHolder {
        return GalleryPostersFragmentViewHolder(
            MainPosterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: GalleryPostersFragmentViewHolder, position: Int) {
        val item = getItem(position)
        Log.d("GalleryPostersToFromFilmsFragmentAdapter", "GalleryPostersToFromFilmsFragmentAdapter getItem $item")
        holder.binding.root.setOnClickListener {
            onClick.invoke(position, this.hashCode())
            Log.d("GalleryPostersToFromFilmsFragmentAdapter", "GalleryPostersToFromFilmsFragmentAdapter   holder.binding.root.setOnClickListener $it")
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
class DiffUtilCallback5 : DiffUtil.ItemCallback<MainPosterGallery>() {
    override fun areItemsTheSame(oldItem: MainPosterGallery, newItem: MainPosterGallery): Boolean =
        oldItem.previewUrl == newItem.previewUrl
    override fun areContentsTheSame(oldItem: MainPosterGallery, newItem: MainPosterGallery): Boolean =
        oldItem == newItem
}
