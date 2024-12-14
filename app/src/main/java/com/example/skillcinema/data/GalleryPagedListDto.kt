package com.example.skillcinema.data

import com.example.skillcinema.entity.gallery.Gallery
import com.example.skillcinema.entity.gallery.GalleryPagedList

class GalleryPagedListDto (
    override  val total: Int,
    override val totalPages: Int,
    override val items: List<Gallery>
    ): GalleryPagedList
