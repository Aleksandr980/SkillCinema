package com.example.skillcinema.presentation.actorpage_directorpage_Fragment.actor

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.HomepageItemBinding
import com.example.skillcinema.entity.actor_person.ActorPerson

class TopMovieByActorAdaptor(
    private val onClick: (position: Int, hash: Int) -> Unit
) : ListAdapter<ActorPerson, TopMovieByActorViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopMovieByActorViewHolder {
        return TopMovieByActorViewHolder(
            HomepageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: TopMovieByActorViewHolder, position: Int) {

        val item = getItem(position)
        Log.d("TopMovieByActorAdaptor", "TopMovieByActorAdaptor getItem $item")

        holder.binding.root.setOnClickListener {
            onClick.invoke(position, this.hashCode())
            Log.d("TopMovieByActorAdaptor", "TopMovieByActorAdaptor   holder.binding.root.setOnClickListener $it")
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

class TopMovieByActorViewHolder(val binding: HomepageItemBinding ):
    RecyclerView.ViewHolder(binding.root)



