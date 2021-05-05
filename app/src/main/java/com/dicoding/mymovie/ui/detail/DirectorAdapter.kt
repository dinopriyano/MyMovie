package com.dicoding.mymovie.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.mymovie.R
import com.dicoding.mymovie.data.DirectorEntity
import com.dicoding.mymovie.databinding.ItemDirectorBinding

class DirectorAdapter: RecyclerView.Adapter<DirectorAdapter.DirectorViewHolder>() {

    val directors = ArrayList<DirectorEntity>()

    fun setDirectors(directors: ArrayList<DirectorEntity>){
        if(directors == null)
            return

        this.directors.clear()
        this.directors.addAll(directors)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DirectorAdapter.DirectorViewHolder {
        val binding = ItemDirectorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DirectorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DirectorAdapter.DirectorViewHolder, position: Int) {
        val director = directors.get(position)
        holder.bind(director)
    }

    override fun getItemCount() = directors.size

    class DirectorViewHolder(val binding: ItemDirectorBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(director: DirectorEntity){
            with(binding){
                txtName.text = director.name
                Glide.with(itemView.context)
                    .load(director.photo)
                    .circleCrop()
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(binding.ivPerson)
            }
        }
    }
}