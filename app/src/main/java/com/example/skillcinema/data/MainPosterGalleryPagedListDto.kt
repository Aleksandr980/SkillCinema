package com.example.skillcinema.data

import com.example.skillcinema.entity.mainPosterGallery.MainPosterGallery
import com.example.skillcinema.entity.mainPosterGallery.MainPosterGalleryPagedList

class MainPosterGalleryPagedListDto(
    override  val total: Int,
    override val totalPages: Int,
    override val items: List<MainPosterGallery>
): MainPosterGalleryPagedList
