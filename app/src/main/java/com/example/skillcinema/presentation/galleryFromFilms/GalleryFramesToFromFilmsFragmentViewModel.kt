package com.example.skillcinema.presentation.galleryFromFilms

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetGalleryPagedListRepositoryUseCase
import com.example.skillcinema.entity.gallery.Gallery
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GalleryFramesToFromFilmsFragmentViewModel private constructor(
    val getGalleryPagedListRepositoryUseCase: GetGalleryPagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetGalleryPagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private var _imageGalleryFragment = MutableStateFlow<List<Gallery>>(emptyList())
    val imageGalleryFragment = _imageGalleryFragment.asStateFlow()


     fun loadGalleryFramesToFromFilmsFragment(idGallary: Int){
       viewModelScope.launch(Dispatchers.IO){
           kotlin.runCatching {
                Log.d("GalleryFramesToFromFilmsFragmentViewModel", "GalleryFramesToFromFilmsFragmentViewModel loadGalleryFramesToFromFilmsFragment id = $idGallary")
                getGalleryPagedListRepositoryUseCase.executeGallery(idGallary, "STILL", 1)
            }.fold(
                onSuccess = {
                    Log.d("GalleryFramesToFromFilmsFragmentViewModel", "GalleryFramesToFromFilmsFragmentViewModel loadGalleryFramesToFromFilmsFragment onSuccess $it")
                    _imageGalleryFragment.value = it.items
                    _isLoading.value = isLoading.value
                },
                onFailure = { Log.d("GalleryFramesToFromFilmsFragmentViewModel","GalleryFramesToFromFilmsFragmentViewModel loadGalleryFramesToFromFilmsFragment onFailure $it")}
            )
        }
    }
}