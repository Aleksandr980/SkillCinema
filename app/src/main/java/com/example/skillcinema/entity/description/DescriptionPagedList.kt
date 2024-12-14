package com.example.skillcinema.entity.description

interface DescriptionPagedList {
    val kinopoiskId: Int
    val kinopoiskHDId: String
    val imdbId: String
    val nameRu: String
    val nameEn: String
    val nameOriginal: String
    val posterUrl: String
    val posterUrlPreview: String
    val coverUrl: String
    val logoUrl: String
    val reviewsCount: Int
    val ratingGoodReview: Number
    val ratingGoodReviewVoteCount: Int
    val ratingKinopoisk: Number
    val ratingKinopoiskVoteCount: Int
    val ratingImdb: Number
    val ratingImdbVoteCount: Int
    val ratingFilmCritics: Number
    val ratingFilmCriticsVoteCount: Int
    val ratingAwait: Number
    val ratingAwaitCount: Int
    val ratingRfCritics: Number
    val ratingRfCriticsVoteCount: Int
    val webUrl: String
    val year: Int
    val filmLength: Int
    val slogan: String
    val description: String
    val shortDescription: String
    val editorAnnotation: String
    val isTicketsAvailable: Boolean
    val productionStatus: String
    val type: String
    val ratingMpaa: String
    val ratingAgeLimits: String
    val hasImax: Boolean
    val has3D: Boolean
    val lastSync: String
    val countries: List<Country>
    val genres: List<Genre>
    val startYear: Int
    val endYear: Int
    val serial: Boolean
    val shortFilm: Boolean
    val completed: Boolean
}
