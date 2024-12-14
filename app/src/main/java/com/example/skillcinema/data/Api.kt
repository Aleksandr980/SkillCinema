package com.example.skillcinema.data

import com.example.skillcinema.entity.actor.Actor
import com.example.skillcinema.entity.actor_person.ActorPerson
import com.example.skillcinema.entity.director.Director
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films")
    suspend fun dramasFrance(
        @Query("genres") genres: Int,
        @Query("countries") countries: Int
    ): MoviePagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/collections?type=TOP_POPULAR_MOVIES")
    suspend fun popular(
        @Query("page") page: Int
    ): MoviePagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/premieres")
    suspend fun premieres(
        @Query("year") year: Int,
        @Query("month") month: String
    ): MoviePagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films?type=TV_SERIES")
    suspend fun serials(
        @Query("page") page: Int
    ): MoviePagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/collections?type=TOP_250_MOVIES")
    suspend fun topList(
        @Query("page") page: Int
    ): MoviePagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films")
    suspend fun usMilitants(
        @Query("genres") genres: Int,
        @Query("countries") countries: Int
    ): MoviePagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/{id}")
    suspend fun description(
        @Path("id") id: Int
    ): DescriptionPagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/{id}/images")
    suspend fun gallery(
        @Path("id") id: Int,
        @Query("type") type: String,
        @Query("page") page: Int
    ): GalleryPagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v1/staff?staffType=ACTOR")
    suspend fun staffActor(
        @Query("filmId") filmId: Int
    ): List<Actor>

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v1/staff?staffType=DIRECTOR")
    suspend fun staffDirector(
        @Query("filmId") filmId: Int
    ): List<Director>

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/{id}/similars")
    suspend fun similars(
        @Path("id") id: Int,
    ): SimilarsMoviePagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/{id}/images")
    suspend fun maimPoster(
        @Path("id") id: Int,
        @Query("type") type: String,
        @Query("page") page: Int
    ): MainPosterPagedListDto

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/{id}/images")
    suspend fun maimPosterGallery(
        @Path("id") id: Int,
        @Query("type") type: String,
        @Query("page") page: Int
    ): MainPosterGalleryPagedListDto




    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v1/staff/{personId}")
    suspend fun getTopMoviesByActorId(@Path("personId") personId: Int):  ActorPerson

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v1/staff/{personId}")
    suspend fun getTopMoviesByDirectorId(@Path("personId") personId: Int): ActorPerson
    private companion object {
        private const val API_KEY = "3c6a6959-033f-4613-aea9-b64a23de7fd6"
        private const val API_KEY2 = "f7082090-6e05-4a1a-bdc0-cc830e21beb9"
        private const val API_KEY3 = "b8899d5a-8e1d-410e-874d-850c364e1d56"
        private const val API_KEY4 = "84502ea3-b9b4-47df-8f55-3c2b6bf9d193"
    }
}

val retrofit = Retrofit
    .Builder()
    .client(
        OkHttpClient.Builder().addInterceptor(
            HttpLoggingInterceptor().also {
                it.level = HttpLoggingInterceptor.Level.BODY
            }).build()
    )
    .baseUrl("https://kinopoiskapiunofficial.tech")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(Api::class.java)
