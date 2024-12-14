package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.retrofit
import com.example.skillcinema.entity.actor_person.ActorPerson
import kotlinx.coroutines.delay

class TopMovieByActorRepository {
    suspend fun getTopMoviesByActorId(staffId: Int):  ActorPerson {
        delay(1000)
        Log.d("TopMovieByActorRepository","TopMovieByActorRepository getTopMoviesByActorId =  $staffId")
        return retrofit.getTopMoviesByActorId(staffId)
    }

}

