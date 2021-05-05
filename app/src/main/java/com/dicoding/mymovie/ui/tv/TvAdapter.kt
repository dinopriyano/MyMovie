package com.dicoding.mymovie.ui.tv

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dicoding.mymovie.R
import com.dicoding.mymovie.data.TvEntity
import com.dicoding.mymovie.databinding.ItemTvBinding
import com.dicoding.mymovie.ui.detail.ContentDetailActivity

class TvAdapter: RecyclerView.Adapter<TvAdapter.TvViewHolder>() {

    private var tves =  ArrayList<TvEntity>()

    fun setTves(tves: ArrayList<TvEntity>){
        if(tves == null)
            return

        this.tves.clear()
        this.tves.addAll(tves)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvAdapter.TvViewHolder {
        val binding: ItemTvBinding = ItemTvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TvAdapter.TvViewHolder, position: Int) {
        val tv = tves.get(position)
        holder.bind(tv)
    }

    override fun getItemCount(): Int = tves.size

    class TvViewHolder(val binding: ItemTvBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(tv: TvEntity){
            with(binding){
                txtTitle.text = tv.title
                txtCreator.text = "Creator:  ${tv.creator}"
                txtTime.text = "Time:  ${tv.time}min"
                txtRating.text = tv.rating.toString()
                movieRating.rating = (tv.rating/2).toFloat()

                Glide.with(itemView.context)
                    .load(tv.image)
                    .transform(RoundedCorners(10))
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error))
                    .into(ivMovie)

                cardView.setOnClickListener{
                    val intent = Intent(itemView.context, ContentDetailActivity::class.java)
                    intent.putExtra(ContentDetailActivity.EXTRA_FILM, tv.id)
                    intent.putExtra(ContentDetailActivity.TYPE, "Tv")
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}