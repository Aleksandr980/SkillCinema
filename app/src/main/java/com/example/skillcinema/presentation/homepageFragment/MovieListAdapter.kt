package com.example.skillcinema.presentation.homepageFragment

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.R
import com.example.skillcinema.databinding.HomepageItemBinding
import com.example.skillcinema.entity.movie.Movie

class MovieListAdapter(
    private val onClick: (position: Int, hash: Int) -> Unit
) : ListAdapter<Movie, MovieViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            HomepageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        val item = getItem(position)
        Log.d("MovieListAdapter", "MovieListAdapter getItem $item")
        holder.binding.root.setOnClickListener {
            onClick.invoke(position, this.hashCode())
            Log.d("MovieListAdapter", "MovieListAdapter  holder.binding.root.setOnClickListener  $it")
        }


        with(holder.binding) {
            if (position in 0..18 ) {
                title.text = item?.nameRu ?: ""
                genre.text = item?.genres?.joinToString(",") { it.genre }
                item?.let {
                    Glide
                        .with(poster.context)
                        .load(it.posterUrlPreview)
                        .into(poster)
                }
            }
            if (position == 19 ) {
                title.text = null
                genre.text = null
                item?.let {
                    Glide
                        .with(poster)
                        .load(R.drawable.strelka_vse)
                        .into(poster)
                }
            }
        }
    }
}
    class DiffUtilCallback : DiffUtil.ItemCallback<Movie>() {

        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean =
            oldItem.kinopoiskId == newItem.kinopoiskId

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean =
            oldItem == newItem
    }

    class MovieViewHolder(val binding: HomepageItemBinding) :
        RecyclerView.ViewHolder(binding.root) {}
