package com.example.skillcinema.presentation.filmpageFragment.we_working_film

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetDirectorPagedListRepositoryUseCase
import com.example.skillcinema.entity.director.Director
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DirectorListViewModel private constructor(
    val getDirectorPagedListRepositoryUseCase: GetDirectorPagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetDirectorPagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val  _director = MutableStateFlow<List<Director>>(emptyList())
    val director = _director.asStateFlow()

    fun loadDirector(id: Int){
        viewModelScope.launch(Dispatchers.IO){
            kotlin.runCatching {
                getDirectorPagedListRepositoryUseCase.executeStaffDirector(id)
            }.fold(
                onSuccess = {
                    Log.d("DirectorListViewModel", "DirectorListViewModel loadDirector onSuccess $it")
                    _director.value = it
                    _isLoading.value = isLoading.value
                },
                onFailure = { Log.d("DirectorListViewModel", "DirectorListViewModel loadDirector onFailure $it")}
            )
            _isLoading.value = false
        }
    }
}