package com.example.skillcinema.presentation

import android.util.Log
import com.example.skillcinema.data.MoviePagedListDto
import com.example.skillcinema.data.retrofit
import kotlinx.coroutines.delay

class MoviePagedListRepository   {
    suspend fun getDramasFrance(genre: Int, country: Int): MoviePagedListDto {
        delay(1000)
        Log.d("MoviePagedListRepository","MoviePagedListRepository getDramasFrance $genre, $country")
        return retrofit.dramasFrance(genre, country)
    }
    suspend fun getPopular(page: Int): MoviePagedListDto {
        delay(1000)
        Log.d("MoviePagedListRepository","MoviePagedListRepository getPopular $page")
        return retrofit.popular(page)
    }
    suspend fun getPremieres(year: Int, month: String): MoviePagedListDto {
        delay(1000)
        Log.d("MoviePagedListRepository","MoviePagedListRepository getPremieres $year, $month")
        return retrofit.premieres(year, month)
    }
    suspend fun getSerials(page: Int): MoviePagedListDto {
        delay(1000)
        Log.d("MoviePagedListRepository","MoviePagedListRepository getSerials $page")
        return retrofit.serials(page)
    }
    suspend fun getTopList(page: Int): MoviePagedListDto {
        delay(1000)
        Log.d("MoviePagedListRepository","MoviePagedListRepository getTopList $page")
        return retrofit.topList(page)

    }
    suspend fun getUsMilitants(genre: Int, country: Int): MoviePagedListDto {
        delay(1000)
        Log.d("MoviePagedListRepository","MoviePagedListRepository getUsMilitants $genre, $country")
        return retrofit.usMilitants(genre, country)
    }


}
