package com.dicoding.mymovie.ui.tv

import androidx.lifecycle.ViewModel
import com.dicoding.mymovie.data.TvEntity
import com.dicoding.mymovie.utils.DataDummy

class TvViewModel: ViewModel() {
    fun getTves(): ArrayList<TvEntity> = DataDummy.generateDummyTv()
}