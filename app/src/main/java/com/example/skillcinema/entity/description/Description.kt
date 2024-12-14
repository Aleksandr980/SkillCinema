package com.example.skillcinema.entity.description

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@kotlinx.parcelize.Parcelize
data class Description(
    @SerializedName("kinopoiskId")
    val kinopoiskId: Int,
    @SerializedName("kinopoiskHDId")
    val kinopoiskHDId: String,
    @SerializedName("imdbId")
    val imdbId: String,
    @SerializedName("nameRu")
    val nameRu: String,
    @SerializedName("nameEn")
    val nameEn: String,
    @SerializedName("nameOriginal")
    val nameOriginal: String,
    @SerializedName("posterUrl")
    val posterUrl: String,
    @SerializedName("posterUrlPreview")
    val posterUrlPreview: String,
    @SerializedName("coverUrl")
    val coverUrl: String,
    @SerializedName("logoUrl")
    val logoUrl: String,
    @SerializedName("reviewsCount")
    val reviewsCount: Int,
    @SerializedName("ratingGoodReview")
    val ratingGoodReview: Number,
    @SerializedName("ratingGoodReviewVoteCount")
    val ratingGoodReviewVoteCount: Int,
    @SerializedName("ratingKinopoisk")
    val ratingKinopoisk: Number,
    @SerializedName("ratingKinopoiskVoteCount")
    val ratingKinopoiskVoteCount: Int,
    @SerializedName("ratingImdb")
    val ratingImdb: Number,
    @SerializedName("ratingImdbVoteCount")
    val ratingImdbVoteCount: Int,
    @SerializedName("ratingFilmCritics")
    val ratingFilmCritics: Number,
    @SerializedName("ratingFilmCriticsVoteCount")
    val ratingFilmCriticsVoteCount: Int,
    @SerializedName("ratingAwait")
    val ratingAwait: Number,
    @SerializedName("ratingAwaitCount")
    val ratingAwaitCount: Int,
    @SerializedName("ratingRfCritics")
    val ratingRfCritics: Number,
    @SerializedName("ratingRfCriticsVoteCount")
    val ratingRfCriticsVoteCount: Int,
    @SerializedName("webUrl")
    val webUrl: String,
    @SerializedName("year")
    val year: Int,
    @SerializedName("filmLength")
    val filmLength: Int,
    @SerializedName("slogan")
    val slogan: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("shortDescription")
    val shortDescription: String,
    @SerializedName("editorAnnotation")
    val editorAnnotation: String,
    @SerializedName("isTicketsAvailable")
    val isTicketsAvailable: Boolean,
    @SerializedName("productionStatus")
    val productionStatus: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("ratingMpaa")
    val ratingMpaa: String,
    @SerializedName("ratingAgeLimits")
    val ratingAgeLimits: String,
    @SerializedName("hasImax")
    val hasImax: Boolean,
    @SerializedName("has3D")
    val has3D: Boolean,
    @SerializedName("lastSync")
    val lastSync: String,
    @SerializedName("countries")
    val countries: List<Country>,
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("startYear")
    val startYear: Int,
    @SerializedName("endYear")
    val endYear: Int,
    @SerializedName("serial")
    val serial: Boolean,
    @SerializedName("shortFilm")
    val shortFilm: Boolean,
    @SerializedName("completed")
    val completed: Boolean,
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


//@SerializedName("kinopoiskId")
//val kinopoiskId: Int,
//@SerializedName("nameRu")
//val nameRu: String,
//@SerializedName("nameEn")
//val nameEn: String,
//@SerializedName("year")
//val year: Int,
//@SerializedName("posterUrl")
//val posterUrl: String,
//@SerializedName("posterUrlPreview")
//val posterUrlPreview: String,
////    @SerializedName("genres")
////    val genres: List<Genre>,
//@SerializedName("premiereRu")
//val premiereRu: String,
////    @SerializedName("countries")
////    val countries: List<Country>,
//@SerializedName("duration")
//val duration: Int,
//@SerializedName("description")
//val description: String

//@kotlinx.parcelize.Parcelize
//data class Genre(
//    @SerializedName("id")
//    val id: Int,
//    @SerializedName("genre")
//    val genre: String
//) : Parcelable
//
//@kotlinx.parcelize.Parcelize
//data class Country(
//    @SerializedName("id")
//    val id: Int,
//    @SerializedName("country")
//    val country: String
//) : Parcelable
