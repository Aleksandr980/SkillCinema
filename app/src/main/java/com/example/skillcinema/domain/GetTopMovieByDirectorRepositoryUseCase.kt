package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.entity.actor_person.ActorPerson
import com.example.skillcinema.presentation.TopMovieByDirectorRepository


class GetTopMovieByDirectorRepositoryUseCase {
    private val topMovieByDirectorRepository = TopMovieByDirectorRepository()
    suspend fun executeTopMovieByDirector(staffId: Int): ActorPerson {
        Log.d("GetTopMovieByDirectorRepositoryUseCase", "GetTopMovieByDirectorRepositoryUseCase executeTopMovieByDirector $staffId")
        val getExecuteTopMovieByDirector = topMovieByDirectorRepository.getTopMoviesByDirectorId(staffId)
        return getExecuteTopMovieByDirector
    }
}

