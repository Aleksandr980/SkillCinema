package com.example.skillcinema.data

import com.example.skillcinema.entity.similarsMovie.SimilarsMovie
import com.example.skillcinema.entity.similarsMovie.SimilarsMoviePagedList

class SimilarsMoviePagedListDto(
    override  val total: Int,
    override val items: List<SimilarsMovie>
): SimilarsMoviePagedList
