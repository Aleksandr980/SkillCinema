package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.data.MainPosterGalleryPagedListDto
import com.example.skillcinema.presentation.MainPosterGalleryListRepository

class GetMainPosterGalleryPagedListRepositoryUseCase  {
    private val mainPosterGalleryListRepository = MainPosterGalleryListRepository()
    suspend fun executeMaimPosterGallery(id: Int, type: String, page: Int): MainPosterGalleryPagedListDto {
        Log.d("GetMainPosterPagedListRepositoryUseCase", "GetMainPosterPagedListRepositoryUseCase executeMaimPoster $id, $type, $page")
        val getExecuteMainPosterGallery = mainPosterGalleryListRepository.getMainPosterGallery(id, type, page)
        return getExecuteMainPosterGallery
    }

}