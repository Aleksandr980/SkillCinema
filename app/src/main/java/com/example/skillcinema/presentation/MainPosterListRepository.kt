package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.MainPosterPagedListDto
import com.example.skillcinema.data.retrofit
import kotlinx.coroutines.delay

class MainPosterListRepository {
    suspend fun getMainPoster(id: Int, type: String, page: Int): MainPosterPagedListDto {
        delay(1000)
        Log.d("MainPosterListRepository","MainPosterListRepository getMainPoster $id, $type, $page")
        return retrofit.maimPoster(id, type, page)
    }


}