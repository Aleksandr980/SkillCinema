package com.example.skillcinema.entity.gallery

interface GalleryPagedList {
    val total: Int
    val totalPages: Int
    val items: List<Gallery>
}