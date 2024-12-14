package com.example.skillcinema.entity.mainPosteer


interface MainPosterPagedList {
    val total: Int
    val totalPages: Int
    val items: List<MainPoster>
}
