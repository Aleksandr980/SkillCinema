package com.example.skillcinema.presentation.homepageFragment.popular

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase
import com.example.skillcinema.entity.movie.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MovieListPopularViewModel private constructor(
    val getMoviePagedListRepositoryUseCase: GetMoviePagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetMoviePagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val  _movies = MutableStateFlow<List<Movie>>(emptyList())
    val movies = _movies.asStateFlow()

    init {
        loadPopular()
    }
    private fun loadPopular(){
        viewModelScope.launch(Dispatchers.IO){
            kotlin.runCatching {
                getMoviePagedListRepositoryUseCase.executePopular(1).items!!
            }.fold(
                onSuccess = {
                    Log.d("MovieListPopularViewModel", "MovieListPopularViewModel loadPopular onSuccess $it")
                    _movies.value = it
                    _isLoading.value = isLoading.value
                            },
                onFailure = { Log.d("MovieListPopularViewModel","MovieListPopularViewModel loadPopular onFailure $it")}
            )
        }
    }
}