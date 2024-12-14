package com.example.skillcinema.domain

import android.util.Log
import com.example.skillcinema.entity.director.Director
import com.example.skillcinema.presentation.DirectorPagedListRepository

class GetDirectorPagedListRepositoryUseCase {
    private val directorPagedListRepository = DirectorPagedListRepository()
    suspend fun executeStaffDirector(filmId: Int): List<Director> {
        Log.d("GetDirectorPagedListRepositoryUseCase", "GetDirectorPagedListRepositoryUseCase executeStaffDirector $filmId")
        val getExecuteStaffDirector = directorPagedListRepository.getStaffDirector(filmId)
        return getExecuteStaffDirector
    }
}