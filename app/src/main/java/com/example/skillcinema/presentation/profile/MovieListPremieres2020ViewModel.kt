package com.example.skillcinema.presentation.profile

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase
import com.example.skillcinema.entity.movie.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MovieListPremieres2020ViewModel private constructor(
    val getMoviePagedListRepositoryUseCase: GetMoviePagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetMoviePagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val  _movies = MutableStateFlow<List<Movie>>(emptyList())
    val movies = _movies.asStateFlow()

    init {
        loadPremieres2020()
    }

    private fun loadPremieres2020(){
        viewModelScope.launch(Dispatchers.IO){
            kotlin.runCatching {
                getMoviePagedListRepositoryUseCase.executePremieres(2020, "AUGUST").items!!
            }.fold(
                onSuccess = {
                    Log.d("MovieListPremieres2020ViewModel", "MovieListPremieres2020ViewModel loadPremieres2020 onSuccess$it")
                    _movies.value = it
                    _isLoading.value = isLoading.value
                            },
                onFailure = { Log.d("MovieListPremieres2020ViewModel","MovieListPremieres2020ViewModel loadPremieres2020 onFailure $it")}
            )
        }
    }

}