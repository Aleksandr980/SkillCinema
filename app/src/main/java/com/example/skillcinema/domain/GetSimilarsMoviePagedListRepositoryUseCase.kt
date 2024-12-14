package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.data.SimilarsMoviePagedListDto
import com.example.skillcinema.presentation.SimilarsMovieListRepository

class GetSimilarsMoviePagedListRepositoryUseCase  {
    private val similarsMovieListRepository = SimilarsMovieListRepository()
    suspend fun executeSimilars(id: Int): SimilarsMoviePagedListDto {
        Log.d("GetSimilarsMoviePagedListRepositoryUseCase", "GetSimilarsMoviePagedListRepositoryUseCase executeSimilars $id")
        val getExecuteSimilars = similarsMovieListRepository.getSimilarsMovie(id)
        return getExecuteSimilars
    }

}