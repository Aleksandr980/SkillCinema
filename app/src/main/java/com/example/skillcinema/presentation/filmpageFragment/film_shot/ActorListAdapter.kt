package com.example.skillcinema.presentation.filmpageFragment.film_shot

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.ActorItemBinding
import com.example.skillcinema.entity.actor.Actor

class ActorListAdapter(
    private val onClickActor: (position: Int, hash: Int) -> Unit
) : ListAdapter<Actor, ActorViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        return ActorViewHolder(
            ActorItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {

        val item = getItem(position)
        Log.d("ActorListAdapter", "ActorListAdapter getItem $item")

        holder.binding.root.setOnClickListener {
            onClickActor.invoke(position, this.hashCode())
            Log.d("ActorListAdapter", "ActorListAdapter   holder.binding.root.setOnClickListener $it")
        }

        with(holder.binding) {
            nameRu.text = item?.nameRu ?: ""
            description.text = item?.description ?: ""

            item?.let {
                Glide
                    .with(posterActor.context)
                    .load(it.posterUrl)
                    .into(posterActor)
            }
        }
    }
}

class DiffUtilCallback : DiffUtil.ItemCallback<Actor>() {

    override fun areItemsTheSame(oldItem: Actor, newItem: Actor): Boolean =
        oldItem.staffId == newItem.staffId

    override fun areContentsTheSame(oldItem: Actor, newItem: Actor): Boolean =
        oldItem == newItem
}

class ActorViewHolder(val binding: ActorItemBinding) :
    RecyclerView.ViewHolder(binding.root)