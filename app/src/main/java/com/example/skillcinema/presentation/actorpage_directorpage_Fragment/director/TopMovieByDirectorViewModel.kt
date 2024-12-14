package com.example.skillcinema.presentation.actorpage_directorpage_Fragment.director

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetTopMovieByDirectorRepositoryUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import android.util.Log
import com.example.skillcinema.entity.actor_person.PersonResponse_films

class TopMovieByDirectorViewModel private constructor(
    val getTopMovieByDirectorRepositoryUseCase: GetTopMovieByDirectorRepositoryUseCase
) : ViewModel() {
    constructor() : this(GetTopMovieByDirectorRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()


    private val _filmDir = MutableStateFlow<List<PersonResponse_films>>(emptyList())
    val filmDir = _filmDir.asStateFlow()


    fun loadTopMovieByDirector(staffId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching {
                _isLoading.value = true
                getTopMovieByDirectorRepositoryUseCase.executeTopMovieByDirector(staffId).films
            }.fold(
                onSuccess = {
                    Log.d(
                        "TopMovieByDirectorViewModel",
                        "TopMovieByDirectorViewModel loadTopMovieByDirector onSuccess == $it"
                    )
                    _filmDir.value = it
                    _isLoading.value = isLoading.value
                },
                onFailure = {
                    Log.d(
                        "TopMovieByDirectorViewModel",
                        "TopMovieByDirectorViewModel loadTopMovieByDirector onFailure $it"
                    )
                }
            )
            _isLoading.value = false
        }

    }
}

