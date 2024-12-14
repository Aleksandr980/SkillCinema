package com.example.skillcinema.presentation.filmpageFragment.description

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.data.DescriptionPagedListDto
import com.example.skillcinema.domain.GetDescriptionMoviePagedListRepositoryUseCase
import com.example.skillcinema.entity.description.Country
import com.example.skillcinema.entity.description.Genre
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DescriptionMovieListViewModel private constructor(
    val getDescriptionMoviePagedListRepositoryUseCase: GetDescriptionMoviePagedListRepositoryUseCase
) : ViewModel() {
    constructor() : this(GetDescriptionMoviePagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val _descriptionMovies = MutableStateFlow(
        DescriptionPagedListDto(
            0, "", "", "", "", "", "", "", "", "", 0,
            0.0, 0, 0.0, 0, 0.0, 0, 0.0,
            0, 0.0, 0, 0.0, 0, "", 0, 0, "", "",
            "", "", false, "", "", "", "", false, false, "",
            listOf(Country(0, "")), listOf(Genre(0, "")), 0, 0, false, false, false
        ).description
    )
    val descriptionMovies = _descriptionMovies.asStateFlow()

    fun loadDescription(id: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching {
                getDescriptionMoviePagedListRepositoryUseCase.executeDescription(id)
            }.fold(
                onSuccess = {
                    Log.d(
                        "DescriptionMovieListViewModel",
                        "DescriptionMovieListViewModel loadDescription onSuccess = ${it}"
                    )
                    _descriptionMovies.value = it
                    _isLoading.value = isLoading.value
                },
                onFailure = {
                    Log.d(
                        "DescriptionMovieListViewModel",
                        "DescriptionMovieListViewModel loadDescription onFailure $it"
                    )
                }
            )
        }
    }

}
