package com.example.skillcinema.presentation.filmpageFragment.film_shot

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetActorPagedListRepositoryUseCase
import com.example.skillcinema.entity.actor.Actor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ActorListViewModel private constructor(
    val getActorPagedListRepositoryUseCase: GetActorPagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetActorPagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val  _actor = MutableStateFlow<List<Actor>>(emptyList())
    val actor = _actor.asStateFlow()

    fun loadActor(id: Int){
        viewModelScope.launch(Dispatchers.IO){
            kotlin.runCatching {
                getActorPagedListRepositoryUseCase.executeStaffActor(id)
            }.fold(
                onSuccess = {
                    Log.d("ActorListViewModel", "ActorListViewModel loadActor onSuccess $it")
                    _actor.value = it
                    _isLoading.value = isLoading.value
                },
                onFailure = { Log.d("ActorListViewModel","ActorListViewModel loadActor onFailure $it")}
            )
            _isLoading.value = false
        }
    }
}