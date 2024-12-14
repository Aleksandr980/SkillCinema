package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.entity.actor_person.ActorPerson
import com.example.skillcinema.presentation.TopMovieByActorRepository


class GetTopMovieByActorRepositoryUseCase {
    private val topMovieByActorRepository = TopMovieByActorRepository()
    suspend fun executeTopMovieByActor(staffId: Int):  ActorPerson {
        Log.d("GetTopMovieByActorRepositoryUseCase", "GetTopMovieByActorRepositoryUseCase executeTopMovieByActor $staffId")
        val getExecuteTopMovieByActor = topMovieByActorRepository.getTopMoviesByActorId(staffId)
        return getExecuteTopMovieByActor
    }
}

