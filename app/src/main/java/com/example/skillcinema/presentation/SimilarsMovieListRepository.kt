package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.SimilarsMoviePagedListDto
import com.example.skillcinema.data.retrofit
import kotlinx.coroutines.delay

class SimilarsMovieListRepository {
    suspend fun getSimilarsMovie(id: Int): SimilarsMoviePagedListDto {
        delay(1000)
        Log.d("SimilarsMovieListRepository","SimilarsMovieListRepository getSimilarsMovie $id")
        return retrofit.similars(id)
    }


}