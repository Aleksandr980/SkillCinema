package com.example.skillcinema.presentation.filmpageFragment.similars

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetSimilarsMoviePagedListRepositoryUseCase
import com.example.skillcinema.entity.similarsMovie.SimilarsMovie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SimilarsMovieListViewModel private constructor(
    val getSimilarsMoviePagedListRepositoryUseCase: GetSimilarsMoviePagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetSimilarsMoviePagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val  _similarsMovies = MutableStateFlow<List<SimilarsMovie>>(emptyList())
    val similarsMovies = _similarsMovies.asStateFlow()

    init {
        loadSimilars(id = null)
    }
fun loadSimilars(id: Int?){
        viewModelScope.launch(Dispatchers.IO){
            kotlin.runCatching {
                getSimilarsMoviePagedListRepositoryUseCase.executeSimilars(id!!)
            }.fold(
                onSuccess = {
                    Log.d("SimilarsMovieListViewModel", "SimilarsMovieListViewModel loadSimilars onSuccess${it.items}")
                    _similarsMovies.value = it.items
                    _isLoading.value = isLoading.value
                            },
                onFailure = { Log.d("SimilarsMovieListViewModel","SimilarsMovieListViewModel loadSimilars onFailure $it")}
            )
        }
    }
}