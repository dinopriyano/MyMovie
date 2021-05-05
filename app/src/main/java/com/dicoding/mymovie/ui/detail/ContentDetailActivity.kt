package com.dicoding.mymovie.ui.detail

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.os.Build
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginTop
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.mymovie.R
import com.dicoding.mymovie.data.MovieEntity
import com.dicoding.mymovie.data.TvEntity
import com.dicoding.mymovie.databinding.ActivityContentDetailBinding
import java.text.SimpleDateFormat
import kotlin.math.ceil


class ContentDetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_FILM = "extra_film"
        const val TYPE = "type"
    }

    private lateinit var binding: ActivityContentDetailBinding
    private lateinit var viewModel: ContentDetailViewModel
    private lateinit var directorAdapter: DirectorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContentDetailBinding.inflate(layoutInflater)
        setTransparantStatusBar()
        setContentView(binding.root)

        binding.btnBack.setOnClickListener(this)

        directorAdapter = DirectorAdapter()
        viewModel = ViewModelProvider(this).get(ContentDetailViewModel::class.java)

        val extras = intent.extras
        if (extras != null) {
            val filmID = extras.getString(EXTRA_FILM)
            val type = extras.getString(TYPE)
            if (filmID != null) {
                viewModel.setFilmID(filmID)
                populateFilm(
                    type!!,
                    (if (type == "Movie") viewModel.getMovie() else viewModel.getTv())!!
                )
            }
        }
    }

    private fun setTransparantStatusBar(){
        setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true)
        if (Build.VERSION.SDK_INT >= 19) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }

        binding.linearLayout.setPadding(getSizeInDP(10), getStatusBarHeight(this) + getSizeInDP(10), getSizeInDP(10), getSizeInDP(10))
    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = window
        val winParams = win.attributes
        if (on) {
            winParams.flags = winParams.flags or bits
        } else {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }

    private fun getStatusBarHeight(context: Context): Int {
        val resources: Resources = context.resources
        val resourceId: Int = resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId > 0) resources.getDimensionPixelSize(resourceId) else ceil((if (VERSION.SDK_INT >= VERSION_CODES.M) 24 else 25) * resources.displayMetrics.density)
            .toInt()
    }

    private fun getSizeInDP(num: Int): Int{
        return (num * resources.displayMetrics.density).toInt()
    }

    private fun populateFilm(type: String, entity: Any){
        val dateFormat = SimpleDateFormat("dd MMMM yyyy")
        if(type == "Movie"){
            val movie = entity as MovieEntity
            movie.releaseDate.year -= 1900
            with(binding){
                txtDate.text = dateFormat.format(movie.releaseDate)
                txtDesc.text = movie.desc
                txtRating.text = movie.rating.toString()
                movieRating.rating = (movie.rating/2).toFloat()
                txtTime.text = "${movie.time}min"
                txtTitle.text = movie.title
                txtTitleDir.text = "Director"

                Glide.with(this@ContentDetailActivity)
                    .load(movie.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(binding.ivFilm)

                val directors = viewModel.getDirectors(movie.director)
                directorAdapter.setDirectors(directors)
            }
        }
        else if(type == "Tv"){
            val tv = entity as TvEntity
            tv.releaseDate.year -= 1900
            with(binding){
                txtDate.text = dateFormat.format(tv.releaseDate)
                txtDesc.text = tv.desc
                txtRating.text = tv.rating.toString()
                movieRating.rating = (tv.rating/2).toFloat()
                txtTime.text = "${tv.time}min"
                txtTitle.text = tv.title
                txtTitleDir.text = "Creator"

                Glide.with(this@ContentDetailActivity)
                    .load(tv.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(binding.ivFilm)

                val creator = viewModel.getDirectors(tv.creator)
                directorAdapter.setDirectors(creator)
            }
        }

        with(binding.rvDirector) {
            layoutManager = GridLayoutManager(this@ContentDetailActivity,3)
            setHasFixedSize(true)
            this.adapter = directorAdapter
        }
    }

    override fun onClick(v: View?) {
        when(v?.id!!){
            R.id.btnBack -> {
                onBackPressed()
            }
        }
    }
}