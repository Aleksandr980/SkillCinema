package com.example.skillcinema.presentation.galleryFromFilms

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetMainPosterGalleryPagedListRepositoryUseCase
import com.example.skillcinema.entity.mainPosterGallery.MainPosterGallery
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GalleryPostersToFromFilmsFragmentViewModel private constructor(
    val getMainPosterGalleryPagedListRepositoryUseCase: GetMainPosterGalleryPagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetMainPosterGalleryPagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private var _imageGalleryPosterFragment = MutableStateFlow<List<MainPosterGallery>>(emptyList())
    val imageGalleryPosterFragment = _imageGalleryPosterFragment.asStateFlow()

    fun loadGalleryPostersToFromFilmsFragment(id: Int){
        viewModelScope.launch(Dispatchers.IO){
            kotlin.runCatching {
                Log.d("GalleryPostersToFromFilmsFragmentViewModel", "GalleryPostersToFromFilmsFragmentViewModel loadGalleryPostersToFromFilmsFragment id = $id")
                getMainPosterGalleryPagedListRepositoryUseCase.executeMaimPosterGallery(id, "POSTER", 1)
            }.fold(
                onSuccess = {
                    Log.d("GalleryPostersToFromFilmsFragmentViewModel", "GalleryPostersToFromFilmsFragmentViewModel loadGalleryPostersToFromFilmsFragment onSuccess $it")
                    _imageGalleryPosterFragment.value = it.items
                    _isLoading.value = isLoading.value
                },
                onFailure = { Log.d("GalleryPostersToFromFilmsFragmentViewModel","GalleryPostersToFromFilmsFragmentViewModel loadGalleryPostersToFromFilmsFragment onFailure $it")}
            )
        }
    }
}