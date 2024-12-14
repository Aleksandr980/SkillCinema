package com.example.skillcinema.presentation.filmpageFragment.main_poster

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetMainPosterPagedListRepositoryUseCase
import com.example.skillcinema.entity.mainPosteer.MainPoster
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainPosterListViewModel private constructor(
    val getMainPosterPagedListRepositoryUseCase: GetMainPosterPagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetMainPosterPagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val  _mainPoster = MutableStateFlow<List<MainPoster>>(emptyList())
    val mainPoster = _mainPoster.asStateFlow()

    fun loadMainPoster(id: Int){
        viewModelScope.launch(Dispatchers.IO){
            kotlin.runCatching {
                getMainPosterPagedListRepositoryUseCase.executeMaimPoster(id, "POSTER", 1)
            }.fold(
                onSuccess = {
                    Log.d("MainPosterListViewModel", "MainPosterListViewModel loadMainPoster onSuccess${it.items}")
                    _mainPoster.value = it.items
                    _isLoading.value = isLoading.value
                },
                onFailure = { Log.d("MainPosterListViewModel","MainPosterListViewModel loadMainPoster onFailure  $it")}
            )
        }
    }
}