package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.presentation.DescriptionMovieListRepository

class GetDescriptionMoviePagedListRepositoryUseCase  {
    private val descriptionMovieListRepository = DescriptionMovieListRepository()
    suspend fun executeDescription(id: Int): String {
        Log.d("GetDescriptionMoviePagedListRepositoryUseCase", "GetDescriptionMoviePagedListRepositoryUseCase executeDescription = $id")
        val getExecuteDescription = descriptionMovieListRepository.getDescriptionMovie(id)
        return getExecuteDescription
    }

}