package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.data.MainPosterPagedListDto
import com.example.skillcinema.presentation.MainPosterListRepository

class GetMainPosterPagedListRepositoryUseCase  {
    private val mainPosterListRepository = MainPosterListRepository()
    suspend fun executeMaimPoster(id: Int, type: String, page: Int): MainPosterPagedListDto {
        Log.d("GetMainPosterPagedListRepositoryUseCase", "GetMainPosterPagedListRepositoryUseCase executeMaimPoster $id, $type, $page")
        val getExecuteMainPoster = mainPosterListRepository.getMainPoster(id, type, page)
        return getExecuteMainPoster
    }

}