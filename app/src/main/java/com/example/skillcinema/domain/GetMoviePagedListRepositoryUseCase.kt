package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.data.MoviePagedListDto
import com.example.skillcinema.presentation.MoviePagedListRepository

class GetMoviePagedListRepositoryUseCase  {
    private val moviePagedListRepository = MoviePagedListRepository()
    suspend fun executeDramasFrance(genre: Int, country: Int): MoviePagedListDto {
        Log.d("GetMoviePagedListRepositoryUseCase", "GetMoviePagedListRepositoryUseCase executeDramasFrance $genre, $country")
        val getExecuteDramasFrance = moviePagedListRepository.getDramasFrance(genre, country)
        return getExecuteDramasFrance
    }

    suspend fun executePopular(page: Int): MoviePagedListDto {
        Log.d("GetMoviePagedListRepositoryUseCase", "GetMoviePagedListRepositoryUseCase executePopular $page")
        val getExecutePopular = moviePagedListRepository.getPopular(page)
        return getExecutePopular
    }

    suspend fun executePremieres(year: Int, month: String): MoviePagedListDto {
        Log.d("GetMoviePagedListRepositoryUseCase", "GetMoviePagedListRepositoryUseCase executePremieres $year, $month")
        val getExecutePremieres = moviePagedListRepository.getPremieres(year, month)
        return getExecutePremieres
    }

    suspend fun executeSerials(id: Int): MoviePagedListDto {
        Log.d("GetMoviePagedListRepositoryUseCase", "GetMoviePagedListRepositoryUseCase executeSerials $id")
        val getExecuteSerials = moviePagedListRepository.getSerials(id)
        return getExecuteSerials
    }

    suspend fun executeTopList(page: Int): MoviePagedListDto {
        Log.d("GetMoviePagedListRepositoryUseCase", "GetMoviePagedListRepositoryUseCase executeTopList $page")
        val getExecuteTopList = moviePagedListRepository.getTopList(page)
        return getExecuteTopList
    }

    suspend fun executeUsMilitants(genre: Int, country: Int): MoviePagedListDto {
        Log.d("GetMoviePagedListRepositoryUseCase", "GetMoviePagedListRepositoryUseCase executeUsMilitants $genre, $country")
        val getExecuteUsMilitants = moviePagedListRepository.getUsMilitants(genre, country)
        return getExecuteUsMilitants
    }

}