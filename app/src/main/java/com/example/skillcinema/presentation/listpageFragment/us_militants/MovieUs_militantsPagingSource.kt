package com.example.skillcinema.presentation.listpageFragment.us_militants

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase
import com.example.skillcinema.entity.movie.Movie

class MovieUs_militantsPagingSource: PagingSource<Int, Movie>() {

    val getMoviePagedListRepositoryUseCase = GetMoviePagedListRepositoryUseCase()

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? = FIRST_PAGE

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        try {
            val page = params.key ?: FIRST_PAGE
            val response = getMoviePagedListRepositoryUseCase.executeUsMilitants(3,1)
            val movies = response.items?: emptyList() // проверка на null и присвоение пустого списка, если значение null
            return LoadResult.Page(
                data = movies,
                prevKey = if (page == 1) null else page - 1,
                nextKey = if (movies.isEmpty()) null else page + 1 // добавление проверки на пустой список перед установкой следующего ключа
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }

        Log.d("MovieUs_militantsPagingSource", "MovieUs_militantsPagingSource load params = ${params}")
    }
    private companion object {
        private val FIRST_PAGE = 1
    }
}