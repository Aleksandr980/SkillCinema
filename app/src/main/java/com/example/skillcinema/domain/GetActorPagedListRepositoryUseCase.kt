package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.entity.actor.Actor
import com.example.skillcinema.presentation.ActorPagedListRepository


class GetActorPagedListRepositoryUseCase {
    private val actorPagedListRepository = ActorPagedListRepository()
    suspend fun executeStaffActor(filmId: Int): List<Actor> {
        Log.d("GetActorPagedListRepositoryUseCase", "GetActorPagedListRepositoryUseCase executeStaffActor $filmId")
        val getExecuteStaffActor = actorPagedListRepository.getStaffActor(filmId)
        return getExecuteStaffActor
    }
}