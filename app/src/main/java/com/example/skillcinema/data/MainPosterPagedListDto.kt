package com.example.skillcinema.data

import com.example.skillcinema.entity.mainPosteer.MainPoster
import com.example.skillcinema.entity.mainPosteer.MainPosterPagedList

class MainPosterPagedListDto(
    override  val total: Int,
    override val totalPages: Int,
    override val items: List<MainPoster>
): MainPosterPagedList
