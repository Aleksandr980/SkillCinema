package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.retrofit
import com.example.skillcinema.entity.actor_person.ActorPerson
import kotlinx.coroutines.delay

class TopMovieByDirectorRepository {
    suspend fun getTopMoviesByDirectorId(staffId: Int): ActorPerson {
        delay(1000)
        Log.d("TopMovieByDirectorRepository","TopMovieByDirectorRepository getTopMoviesByDirectorId =  $staffId")
        return retrofit.getTopMoviesByDirectorId(staffId)
    }

}

