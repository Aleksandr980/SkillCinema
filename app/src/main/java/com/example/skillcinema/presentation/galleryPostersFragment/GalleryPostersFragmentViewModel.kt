package com.example.skillcinema.presentation.galleryPostersFragment

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.skillcinema.domain.GetMainPosterGalleryPagedListRepositoryUseCase
import com.example.skillcinema.entity.mainPosterGallery.MainPosterGallery
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GalleryPostersFragmentViewModel private constructor(
    val getMainPosterGalleryPagedListRepositoryUseCase: GetMainPosterGalleryPagedListRepositoryUseCase
): ViewModel(){
    constructor(): this(GetMainPosterGalleryPagedListRepositoryUseCase())

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private var _imageGalleryPosterFragment = MutableStateFlow<List<MainPosterGallery>>(emptyList())
    val imageGalleryPosterFragment = _imageGalleryPosterFragment.asStateFlow()


     fun loadGalleryPostersFragment(id: Int){
       viewModelScope.launch(Dispatchers.IO){
           kotlin.runCatching {
                Log.d("GalleryPostersFragmentViewModel", "GalleryPostersFragmentViewModel loadGalleryPostersFragment id = $id")
               getMainPosterGalleryPagedListRepositoryUseCase.executeMaimPosterGallery(id, "POSTER", 1)
            }.fold(
                onSuccess = {
                    Log.d("GalleryPostersFragmentViewModel", "GalleryPostersFragmentViewModel loadGalleryPostersFragment onSuccess $it")
                    _imageGalleryPosterFragment.value = it.items
                    _isLoading.value = isLoading.value
                },
                onFailure = { Log.d("GalleryPostersFragmentViewModel","GalleryPostersFragmentViewModel loadGalleryPostersFragment onFailure $it")}
            )
        }
    }
}