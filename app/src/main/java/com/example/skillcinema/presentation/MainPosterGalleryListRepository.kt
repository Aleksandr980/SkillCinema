package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.MainPosterGalleryPagedListDto
import com.example.skillcinema.data.retrofit
import kotlinx.coroutines.delay

class MainPosterGalleryListRepository {
    suspend fun getMainPosterGallery(id: Int, type: String, page: Int): MainPosterGalleryPagedListDto {
        delay(1000)
        Log.d("MainPosterGalleryListRepository","MainPosterGalleryListRepository getMainPosterGallery $id, $type, $page")
        return retrofit.maimPosterGallery(id, type, page)
    }


}