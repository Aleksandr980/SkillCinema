package com.example.skillcinema.presentation.filmpageFragment.we_working_film

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skillcinema.databinding.DirectorItemBinding
import com.example.skillcinema.entity.director.Director

class DirectorListAdapter(
    private val onClickDirector: (position: Int, hash: Int) -> Unit
) : ListAdapter<Director, DirectorViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DirectorViewHolder {
        return DirectorViewHolder(
            DirectorItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: DirectorViewHolder, position: Int) {

        val item = getItem(position)
        Log.d("DirectorListAdapter", "DirectorListAdapter getItem $item")

        holder.binding.root.setOnClickListener {
            onClickDirector.invoke(position, this.hashCode())
            Log.d("DirectorListAdapter", "DirectorListAdapter   holder.binding.root.setOnClickListener $it")
        }

        with(holder.binding) {
            nameRu.text = item?.nameRu ?: ""
            professionKey.text = item?.professionText ?: ""

            item?.let {
                Glide
                    .with(posterDirector.context)
                    .load(it.posterUrl)
                    .into(posterDirector)
            }
        }
    }
}

class DiffUtilCallback : DiffUtil.ItemCallback<Director>() {

    override fun areItemsTheSame(oldItem: Director, newItem: Director): Boolean =
        oldItem.staffId == newItem.staffId

    override fun areContentsTheSame(oldItem: Director, newItem: Director): Boolean =
        oldItem == newItem
}

class DirectorViewHolder(val binding: DirectorItemBinding) :
    RecyclerView.ViewHolder(binding.root)