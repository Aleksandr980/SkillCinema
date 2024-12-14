package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.GalleryPagedListDto
import com.example.skillcinema.data.retrofit
import kotlinx.coroutines.delay

class GalleryPagedListRepository() {
    suspend fun getGallery( id: Int, type: String, page: Int): GalleryPagedListDto {
        delay(1000)
        Log.d("GalleryPagedListRepository","GalleryPagedListRepository getGallery $id, $type, $page")
        return retrofit.gallery(id, type, page)
    }


}