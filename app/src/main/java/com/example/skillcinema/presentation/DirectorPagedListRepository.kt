package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.retrofit
import com.example.skillcinema.entity.director.Director
import kotlinx.coroutines.delay

class DirectorPagedListRepository {
    suspend fun getStaffDirector(filmId: Int): List<Director> {
        delay(1000)
        Log.d("DirectorPagedListRepository","DirectorPagedListRepository getStaffDirector $filmId")
        return retrofit.staffDirector(filmId)
    }


}