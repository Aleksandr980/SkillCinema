package com.example.skillcinema.presentation.listpageFragment.serials

import android.annotation.SuppressLint
import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase
import com.example.skillcinema.entity.movie.Movie
import com.example.skillcinema.presentation.MoviePagedListRepository

class MovieSerialsPagingSource: PagingSource<Int, Movie>() {
    private val moviePagedListRepository = MoviePagedListRepository()
    private val repository = GetMoviePagedListRepositoryUseCase()

    @SuppressLint("SuspiciousIndentation")
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
      val page = params.key ?: FIRST_PAGE

        return kotlin.runCatching {
            repository.executeSerials(page).items!!

        }.fold(
            onSuccess = {
                Log.d("MovieSerialsPagingSource","MovieSerialsPagingSource onSuccess $it")
                LoadResult.Page(
                    data = it,
                    prevKey = null,
                    nextKey = if (it.isEmpty()) null else page + 1
                )
            },
            onFailure = {
                Log.d("MovieSerialsPagingSource","MovieSerialsPagingSource onFailure $it")
                LoadResult.Error(it)
            }
        )
    }
    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? = FIRST_PAGE

    private companion object {
        private val FIRST_PAGE = 1
    }
}
