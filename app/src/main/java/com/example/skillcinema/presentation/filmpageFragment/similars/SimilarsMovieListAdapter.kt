package com.example.skillcinema.presentation.filmpageFragment.similars

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.SimilarsItemBinding
import com.example.skillcinema.entity.similarsMovie.SimilarsMovie

class SimilarsMovieListAdapter(
    private val onClickSimilarsMovie: (position: Int, hash: Int) -> Unit
) : ListAdapter<SimilarsMovie, SimilarsMovieViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimilarsMovieViewHolder {
        return SimilarsMovieViewHolder(
            SimilarsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: SimilarsMovieViewHolder, position: Int) {

        val item = getItem(position)
        Log.d("SimilarsMovieListAdapter", "SimilarsMovieListAdapter getItem $item")

        holder.binding.root.setOnClickListener {
            onClickSimilarsMovie.invoke(position, this.hashCode())
            Log.d("SimilarsMovieListAdapter", "SimilarsMovieListAdapter   holder.binding.root.setOnClickListener $it")
        }

        with(holder.binding) {
            nameRu.text = item?.nameRu ?: ""
            relationType.text = item?.relationType ?: ""
            item?.let {
                Glide
                    .with(poster.context)
                    .load(it.posterUrl)
                    .into(poster)
            }
        }
    }
}

class DiffUtilCallback : DiffUtil.ItemCallback<SimilarsMovie>() {

    override fun areItemsTheSame(oldItem: SimilarsMovie, newItem: SimilarsMovie): Boolean =
        oldItem.filmId == newItem.filmId

    override fun areContentsTheSame(oldItem: SimilarsMovie, newItem: SimilarsMovie): Boolean =
        oldItem == newItem
}

class SimilarsMovieViewHolder(val binding: SimilarsItemBinding) :
    RecyclerView.ViewHolder(binding.root)