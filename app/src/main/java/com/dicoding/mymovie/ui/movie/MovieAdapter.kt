package com.dicoding.mymovie.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dicoding.mymovie.R
import com.dicoding.mymovie.data.MovieEntity
import com.dicoding.mymovie.databinding.ItemMovieBinding
import com.dicoding.mymovie.ui.detail.ContentDetailActivity

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var movies = ArrayList<MovieEntity>()

    fun setMovies(movies: ArrayList<MovieEntity>){
        if(movies == null)
            return

        this.movies.clear()
        this.movies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MovieViewHolder {
        val itemMovieBinding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val movie = movies.get(position)
        holder.bind(movie)
    }

    override fun getItemCount() = movies.size

    class MovieViewHolder(private val binding: ItemMovieBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity){
            with(binding){
                txtTitle.text = movie.title
                txtDirector.text = "Director:  ${movie.director}"
                txtTime.text = "Time:  ${movie.time}min"
                txtRating.text = movie.rating.toString()
                movieRating.rating = (movie.rating/2).toFloat()

                Glide.with(itemView.context)
                    .load(movie.image)
                    .transform(RoundedCorners(10))
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(ivMovie)

                cardView.setOnClickListener{
                    val intent = Intent(itemView.context, ContentDetailActivity::class.java)
                    intent.putExtra(ContentDetailActivity.EXTRA_FILM, movie.id)
                    intent.putExtra(ContentDetailActivity.TYPE, "Movie")
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}