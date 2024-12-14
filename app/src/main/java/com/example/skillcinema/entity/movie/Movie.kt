package com.example.skillcinema.entity.movie

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@kotlinx.parcelize.Parcelize
data class Movie(
    @SerializedName("kinopoiskId")
    val kinopoiskId: Int,
    @SerializedName("nameRu")
    val nameRu: String,
    @SerializedName("nameEn")
    val nameEn: String,
    @SerializedName("year")
    val year: Int,
    @SerializedName("posterUrl")
    val posterUrl: String,
    @SerializedName("posterUrlPreview")
    val posterUrlPreview: String,
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("premiereRu")
    val premiereRu: String,
    @SerializedName("countries")
    val countries: List<Country>,
    @SerializedName("duration")
    val duration: Int,
    @SerializedName("description")
    val description: String
) : Parcelable

@kotlinx.parcelize.Parcelize
data class Genre(
    @SerializedName("id")
    val id: Int,
    @SerializedName("genre")
    val genre: String
) : Parcelable

@kotlinx.parcelize.Parcelize
data class Country(
    @SerializedName("id")
    val id: Int,
    @SerializedName("country")
    val country: String
) : Parcelable
