package com.example.skillcinema.entity.similarsMovie


interface SimilarsMoviePagedList {
    val total: Int
    val items: List<SimilarsMovie>
}
