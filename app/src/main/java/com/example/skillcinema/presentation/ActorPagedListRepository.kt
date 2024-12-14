package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.retrofit
import com.example.skillcinema.entity.actor.Actor
import kotlinx.coroutines.delay


class ActorPagedListRepository {
    suspend fun getStaffActor(filmId: Int): List<Actor> {
        delay(1000)
        Log.d("ActorPagedListRepository","ActorPagedListRepository getStaffActor $filmId")
        return retrofit.staffActor(filmId)
    }
}