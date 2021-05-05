package com.dicoding.mymovie.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.mymovie.data.DirectorEntity
import com.dicoding.mymovie.data.MovieEntity
import com.dicoding.mymovie.data.TvEntity
import com.dicoding.mymovie.utils.DataDummy

class ContentDetailViewModel: ViewModel() {
    private lateinit var filmID: String

    fun setFilmID(filmID: String){
        this.filmID = filmID
    }

    fun getMovie(): MovieEntity?{
        lateinit var movie: MovieEntity
        val movieEntities = DataDummy.generateDummyMovie()
        movieEntities.forEach {
            if(it.id == filmID){
                movie = it
                return movie
            }
        }

        return null
    }

    fun getTv(): TvEntity?{
        lateinit var tv: TvEntity
        val tvEntities = DataDummy.generateDummyTv()
        tvEntities.forEach {
            if(it.id == filmID){
                tv = it
                return tv
            }
        }

        return null
    }

    fun getDirectors(persons: String): ArrayList<DirectorEntity>{
        val arrPerson: ArrayList<String> = persons.split(", ").toCollection(ArrayList())
        var directors = ArrayList<DirectorEntity>()
        arrPerson.forEachIndexed { index, name ->
            directors.add(
                DirectorEntity(
                    DataDummy.getAvatar(index),
                    name
                )
            )
        }

        return directors
    }
}