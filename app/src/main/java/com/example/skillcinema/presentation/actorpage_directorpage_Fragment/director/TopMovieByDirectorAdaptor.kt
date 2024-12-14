package com.example.skillcinema.presentation.actorpage_directorpage_Fragment.director

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.HomepageItemBinding
import com.example.skillcinema.entity.actor_person.ActorPerson

class TopMovieByDirectorAdaptor(
    private val onClick: (position: Int, hash: Int) -> Unit
) : ListAdapter<ActorPerson, TopMovieByDirectorViewHolder>(DiffUtilCallback()) {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopMovieByDirectorViewHolder {
        return TopMovieByDirectorViewHolder(
            HomepageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: TopMovieByDirectorViewHolder, position: Int) {

        val item = getItem(position)
        Log.d("TopMovieByDirectorAdaptor", "TopMovieByDirectorAdaptor getItem $item")

        holder.binding.root.setOnClickListener {
            onClick.invoke(position, this.hashCode())
            Log.d("TopMovieByDirectorAdaptor", "TopMovieByDirectorAdaptor   holder.binding.root.setOnClickListener $it")
        }

        with(holder.binding) {
            title.text = item?.nameRu ?: ""
            item?.let {
                Glide
                    .with(poster.context)
                    .load(it.films)
                    .into(poster)
            }
        }
    }
}

class DiffUtilCallback : DiffUtil.ItemCallback<ActorPerson>() {

    override fun areItemsTheSame(oldItem: ActorPerson, newItem: ActorPerson): Boolean =
        oldItem.films == newItem.films

    override fun areContentsTheSame(oldItem: ActorPerson, newItem: ActorPerson): Boolean =
        oldItem == newItem
}

class TopMovieByDirectorViewHolder(val binding: HomepageItemBinding):
    RecyclerView.ViewHolder(binding.root)



