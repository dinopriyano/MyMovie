package com.dicoding.mymovie.ui.detail

import com.dicoding.mymovie.utils.DataDummy
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class ContentDetailViewModelTest {

    private lateinit var viewModel: ContentDetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummyTv = DataDummy.generateDummyTv()[0]
    private val movieID = dummyMovie.id
    private val tvID = dummyTv.id

    @Before
    fun setUp() {
        viewModel = ContentDetailViewModel()
    }

    @Test
    fun getMovie() {
        viewModel.setFilmID(movieID)
        val movie = viewModel.getMovie()
        assertNotNull(movie)
        assertEquals(dummyMovie, movie)
    }

    @Test
    fun getTv() {
        viewModel.setFilmID(tvID)
        val tv = viewModel.getTv()
        assertNotNull(tv)
        assertEquals(dummyTv, tv)
    }

    @Test
    fun getDirectors() {
        viewModel.setFilmID(movieID)
        val movie = viewModel.getMovie()
        val directors = viewModel.getDirectors(movie?.director!!)
        assertNotNull(directors)
        assertEquals(1,directors.size)
    }

    @Test
    fun getCreators() {
        viewModel.setFilmID(tvID)
        val tv = viewModel.getTv()
        val creators = viewModel.getDirectors(tv?.creator!!)
        assertNotNull(creators)
        assertEquals(1,creators.size)
    }
}