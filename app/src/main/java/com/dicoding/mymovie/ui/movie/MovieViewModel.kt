package com.dicoding.mymovie.ui.movie

import androidx.lifecycle.ViewModel
import com.dicoding.mymovie.data.MovieEntity
import com.dicoding.mymovie.utils.DataDummy

class MovieViewModel: ViewModel() {
    fun getMovies(): ArrayList<MovieEntity> = DataDummy.generateDummyMovie()
}