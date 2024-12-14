package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.data.GalleryPagedListDto
import com.example.skillcinema.presentation.GalleryPagedListRepository

class GetGalleryPagedListRepositoryUseCase() {
    private val galleryPagedListRepository = GalleryPagedListRepository()
    suspend fun executeGallery(id: Int, type: String, page: Int): GalleryPagedListDto {
        Log.d("GetGalleryPagedListRepositoryUseCase", "GetGalleryPagedListRepositoryUseCase executeGallery $id, $type, $page")
        val getExecuteGallery = galleryPagedListRepository.getGallery(id, type, page)
        return getExecuteGallery
    }
}