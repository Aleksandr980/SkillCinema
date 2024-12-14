package com.example.skillcinema.entity.mainPosterGallery


interface MainPosterGalleryPagedList {
    val total: Int
    val totalPages: Int
    val items: List<MainPosterGallery>
}
