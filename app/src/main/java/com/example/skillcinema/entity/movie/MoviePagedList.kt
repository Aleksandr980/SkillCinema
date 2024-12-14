package com.example.skillcinema.entity.movie


interface MoviePagedList {
    val total: Int
    val items: List<Movie>
}
