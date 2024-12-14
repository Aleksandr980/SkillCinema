package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.retrofit
import kotlinx.coroutines.delay

class DescriptionMovieListRepository {
    suspend fun getDescriptionMovie(id: Int): String {
        delay(1000)
        Log.d("DescriptionMovieListRepository","DescriptionMovieListRepository getDescriptionMovie =  $id")
        return retrofit.description(id).description
    }


}