package com.example.skillcinema.presentation.seachFragment

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.SeachItemBinding
import com.example.skillcinema.entity.movie.Movie

class SeachAdapter(
    private val onClick: (Movie) -> Unit
) : PagingDataAdapter<Movie, MovieViewHolder>(DiffUtilCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            SeachItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = getItem(position)

        Log.d("SeachAdapter", "SeachAdapter ${item}")
        with(holder.binding) {

            textView.text = item?.nameRu.toString()
            textView2.text = item?.year?.toString()
            textView3.text = ", "
            val firstWord = item?.genres?.joinToString(" ") { it.genre }
            textView4.text = firstWord?.split(" ")?.firstOrNull() ?: ""


            item?.let {
                Glide
                    .with(poster.context)
                    .load(it.posterUrlPreview)
                    .into(poster)
            }
        }
        holder.binding.root.setOnClickListener {
            item?.let {
                onClick(item)
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

class MovieViewHolder(val binding: SeachItemBinding) : RecyclerView.ViewHolder(binding.root) {

}



