package com.example.skillcinema.presentation.homepageFragment.premieres

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase
import com.example.skillcinema.entity.movie.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MovieListPremieresViewModel private constructor(
    val getMoviePagedListRepositoryUseCase: GetMoviePagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetMoviePagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val  _movies = MutableStateFlow<List<Movie>>(emptyList())
    val movies = _movies.asStateFlow()

    init {
        loadPremieres()
    }

    private fun loadPremieres(){
        viewModelScope.launch(Dispatchers.IO){
            kotlin.runCatching {
                getMoviePagedListRepositoryUseCase.executePremieres(2021, "MAY").items!!
            }.fold(
                onSuccess = {
                    Log.d("MovieListPremieresViewModel", "MovieListPremieresViewModel loadPremieres onSuccess$it")
                    _movies.value = it
                    _isLoading.value = isLoading.value
                            },
                onFailure = { Log.d("MovieListPremieresViewModel","MovieListPremieresViewModel loadPremieres onFailure $it")}
            )
        }
    }

}