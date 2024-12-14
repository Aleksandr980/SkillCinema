package com.example.skillcinema.presentation.homepageFragment.dramas_france

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase
import com.example.skillcinema.entity.movie.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MovieListDramasFranceViewModel private constructor(
    val getMoviePagedListRepositoryUseCase: GetMoviePagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetMoviePagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val  _movies = MutableStateFlow<List<Movie>>(emptyList())
    val movies = _movies.asStateFlow()

    init {
        loadDramasFrance()
    }

    private fun loadDramasFrance(){
        viewModelScope.launch(Dispatchers.IO){
            kotlin.runCatching {
                _isLoading.value = true
                getMoviePagedListRepositoryUseCase.executeDramasFrance(2,3)
            }.fold(
                onSuccess = {
                    Log.d("MovieListDramasFranceViewModel", "MovieListDramasFranceViewModel loadDramasFrance onSuccess$it")
                    _movies.value = it.items
                    _isLoading.value = isLoading.value
                            },
                onFailure = { Log.d("MovieListDramasFranceViewModel", "MovieListDramasFranceViewModel loadDramasFranc onFailure $it")}
            )
            _isLoading.value = false
        }
    }
}