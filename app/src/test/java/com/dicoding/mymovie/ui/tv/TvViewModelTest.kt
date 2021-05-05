package com.dicoding.mymovie.ui.tv

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class TvViewModelTest {

    private lateinit var viewModel: TvViewModel

    @Before
    fun setUp() {
        viewModel = TvViewModel()
    }

    @Test
    fun getTves() {
        val tves = viewModel.getTves()
        assertNotNull(tves)
        assertEquals(10, tves.size)
    }
}