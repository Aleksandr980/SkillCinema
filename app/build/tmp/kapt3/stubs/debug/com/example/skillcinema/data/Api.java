package com.example.skillcinema.data;

import com.example.skillcinema.entity.actor.Actor;
import com.example.skillcinema.entity.actor_person.ActorPerson;
import com.example.skillcinema.entity.director.Director;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 *2\u00020\u0001:\u0001*J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ,\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J,\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0011J,\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u001b\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010 \u001a\u00020!2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\b\b\u0001\u0010%\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0#2\b\b\u0001\u0010%\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010(\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010)\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006+"}, d2 = {"Lcom/example/skillcinema/data/Api;", "", "description", "Lcom/example/skillcinema/data/DescriptionPagedListDto;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dramasFrance", "Lcom/example/skillcinema/data/MoviePagedListDto;", "genres", "countries", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gallery", "Lcom/example/skillcinema/data/GalleryPagedListDto;", "type", "", "page", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopMoviesByActorId", "Lcom/example/skillcinema/entity/actor_person/ActorPerson;", "personId", "getTopMoviesByDirectorId", "maimPoster", "Lcom/example/skillcinema/data/MainPosterPagedListDto;", "maimPosterGallery", "Lcom/example/skillcinema/data/MainPosterGalleryPagedListDto;", "popular", "premieres", "year", "month", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serials", "similars", "Lcom/example/skillcinema/data/SimilarsMoviePagedListDto;", "staffActor", "", "Lcom/example/skillcinema/entity/actor/Actor;", "filmId", "staffDirector", "Lcom/example/skillcinema/entity/director/Director;", "topList", "usMilitants", "Companion", "app_debug"})
public abstract interface Api {
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object dramasFrance(@retrofit2.http.Query(value = "genres")
    int genres, @retrofit2.http.Query(value = "countries")
    int countries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.MoviePagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films/collections?type=TOP_POPULAR_MOVIES")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object popular(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.MoviePagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films/premieres")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object premieres(@retrofit2.http.Query(value = "year")
    int year, @retrofit2.http.Query(value = "month")
    @org.jetbrains.annotations.NotNull()
    java.lang.String month, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.MoviePagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films?type=TV_SERIES")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object serials(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.MoviePagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films/collections?type=TOP_250_MOVIES")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topList(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.MoviePagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object usMilitants(@retrofit2.http.Query(value = "genres")
    int genres, @retrofit2.http.Query(value = "countries")
    int countries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.MoviePagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object description(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.DescriptionPagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/images")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object gallery(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.GalleryPagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v1/staff?staffType=ACTOR")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object staffActor(@retrofit2.http.Query(value = "filmId")
    int filmId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.skillcinema.entity.actor.Actor>> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v1/staff?staffType=DIRECTOR")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object staffDirector(@retrofit2.http.Query(value = "filmId")
    int filmId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.skillcinema.entity.director.Director>> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/similars")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object similars(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.SimilarsMoviePagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/images")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object maimPoster(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.MainPosterPagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/images")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object maimPosterGallery(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.data.MainPosterGalleryPagedListDto> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v1/staff/{personId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTopMoviesByActorId(@retrofit2.http.Path(value = "personId")
    int personId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.entity.actor_person.ActorPerson> $completion);
    
    @retrofit2.http.Headers(value = {"X-API-KEY: 3c6a6959-033f-4613-aea9-b64a23de7fd6"})
    @retrofit2.http.GET(value = "/api/v1/staff/{personId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTopMoviesByDirectorId(@retrofit2.http.Path(value = "personId")
    int personId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.skillcinema.entity.actor_person.ActorPerson> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/skillcinema/data/Api$Companion;", "", "()V", "API_KEY", "", "API_KEY2", "API_KEY3", "API_KEY4", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String API_KEY = "3c6a6959-033f-4613-aea9-b64a23de7fd6";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String API_KEY2 = "f7082090-6e05-4a1a-bdc0-cc830e21beb9";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String API_KEY3 = "b8899d5a-8e1d-410e-874d-850c364e1d56";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String API_KEY4 = "84502ea3-b9b4-47df-8f55-3c2b6bf9d193";
        
        private Companion() {
            super();
        }
    }
}