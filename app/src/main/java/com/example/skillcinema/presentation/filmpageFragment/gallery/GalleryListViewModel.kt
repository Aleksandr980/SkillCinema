package com.example.skillcinema.presentation.filmpageFragment.gallery

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetGalleryPagedListRepositoryUseCase
import com.example.skillcinema.entity.gallery.Gallery
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class GalleryListViewModel private constructor(
    val getGalleryPagedListRepositoryUseCase: GetGalleryPagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetGalleryPagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private var _imageGallery = MutableStateFlow<List<Gallery>>(emptyList())
    val imageGallery = _imageGallery.asStateFlow()

     fun loadGallery(idGallary: Int){
       viewModelScope.launch(Dispatchers.IO){
           kotlin.runCatching {
                Log.d("GalleryListViewModel", "GalleryListViewModel loadGallery id = $idGallary")
                getGalleryPagedListRepositoryUseCase.executeGallery(idGallary, "STILL", 1)
            }.fold(
                onSuccess = {
                    Log.d("GalleryListViewModel", "GalleryListViewModel loadGallery onSuccess $it")
                    _imageGallery.value = it.items
                    _isLoading.value = isLoading.value
                },
                onFailure = { Log.d("GalleryListViewModel","GalleryListViewModel loadGallery onFailure $it")}
            )
        }
    }
}