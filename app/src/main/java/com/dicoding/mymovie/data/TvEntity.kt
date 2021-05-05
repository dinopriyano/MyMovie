package com.dicoding.mymovie.data

import java.util.*

data class TvEntity (
    var id: String,
    var image: String,
    var title: String,
    var desc: String,
    var creator: String,
    var time: Int,
    var rating: Double,
    var releaseDate: Date
)