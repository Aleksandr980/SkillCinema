package com.example.skillcinema.presentation.actorpage_directorpage_Fragment.actor

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetTopMovieByActorRepositoryUseCase
import com.example.skillcinema.entity.actor_person.PersonResponse_films
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TopMovieByActorViewModel private constructor(
    val getTopMovieByActorRepositoryUseCase: GetTopMovieByActorRepositoryUseCase
) : ViewModel() {
    constructor() : this(GetTopMovieByActorRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()


    private val _filmAct = MutableStateFlow<List<PersonResponse_films>>(emptyList())
    val filmAct = _filmAct.asStateFlow()

    fun loadTopMovieByActor(staffId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching {
                _isLoading.value = true
                getTopMovieByActorRepositoryUseCase.executeTopMovieByActor(staffId).films
            }.fold(
                onSuccess = {
                    Log.d(
                        "TopMovieByActorViewModel",
                        "TopMovieByActorViewModel loadTopMovieByActor onSuccess = $it"
                    )
                    _filmAct.value = it
                    _isLoading.value = isLoading.value
                },
                onFailure = {
                    Log.d(
                        "TopMovieByActorViewModel",
                        "TopMovieByActorViewModel loadTopMovieByActor onFailure $it"
                    )
                }
            )
            _isLoading.value = false
        }

    }
}

