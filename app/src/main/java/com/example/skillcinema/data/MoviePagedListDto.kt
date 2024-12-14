package com.example.skillcinema.data

import com.example.skillcinema.entity.movie.Movie
import com.example.skillcinema.entity.movie.MoviePagedList


class MoviePagedListDto(
    override  val total: Int,
    override val items: List<Movie>
): MoviePagedList
