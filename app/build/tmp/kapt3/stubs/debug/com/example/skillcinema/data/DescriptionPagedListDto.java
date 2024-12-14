package com.example.skillcinema.data;

import com.example.skillcinema.entity.description.Country;
import com.example.skillcinema.entity.description.DescriptionPagedList;
import com.example.skillcinema.entity.description.Genre;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0004\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\u0018\u00002\u00020\u0001B\u00f9\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010\'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000-\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020$\u0012\u0006\u00104\u001a\u00020$\u0012\u0006\u00105\u001a\u00020$\u00a2\u0006\u0002\u00106R\u0014\u00105\u001a\u00020$X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0014\u0010 \u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0014\u0010\"\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0014\u00102\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010\u001e\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u0002000-X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0014\u0010*\u001a\u00020$X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00108R\u0014\u0010)\u001a\u00020$X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00108R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010<R\u0014\u0010#\u001a\u00020$X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u00108R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010<R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010@R\u0014\u0010+\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010<R\u0014\u0010\r\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010<R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010<R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010<R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010<R\u0014\u0010%\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010<R\u0014\u0010(\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010<R\u0014\u0010\u0018\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010@R\u0014\u0010\u0016\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010RR\u0014\u0010\u0017\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010@R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010RR\u0014\u0010\u0011\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010@R\u0014\u0010\u0014\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010RR\u0014\u0010\u0015\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010@R\u0014\u0010\u0012\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010RR\u0014\u0010\u0013\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010@R\u0014\u0010\'\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010<R\u0014\u0010\u001a\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010RR\u0014\u0010\u001b\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010@R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010@R\u0014\u00103\u001a\u00020$X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u00108R\u0014\u0010!\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010<R\u0014\u00104\u001a\u00020$X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u00108R\u0014\u0010\u001f\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010<R\u0014\u00101\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010@R\u0014\u0010&\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010<R\u0014\u0010\u001c\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010<R\u0014\u0010\u001d\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010@\u00a8\u0006h"}, d2 = {"Lcom/example/skillcinema/data/DescriptionPagedListDto;", "Lcom/example/skillcinema/entity/description/DescriptionPagedList;", "kinopoiskId", "", "kinopoiskHDId", "", "imdbId", "nameRu", "nameEn", "nameOriginal", "posterUrl", "posterUrlPreview", "coverUrl", "logoUrl", "reviewsCount", "ratingGoodReview", "", "ratingGoodReviewVoteCount", "ratingKinopoisk", "ratingKinopoiskVoteCount", "ratingImdb", "ratingImdbVoteCount", "ratingFilmCritics", "ratingFilmCriticsVoteCount", "ratingAwait", "ratingAwaitCount", "ratingRfCritics", "ratingRfCriticsVoteCount", "webUrl", "year", "filmLength", "slogan", "description", "shortDescription", "editorAnnotation", "isTicketsAvailable", "", "productionStatus", "type", "ratingMpaa", "ratingAgeLimits", "hasImax", "has3D", "lastSync", "countries", "", "Lcom/example/skillcinema/entity/description/Country;", "genres", "Lcom/example/skillcinema/entity/description/Genre;", "startYear", "endYear", "serial", "shortFilm", "completed", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;IIZZZ)V", "getCompleted", "()Z", "getCountries", "()Ljava/util/List;", "getCoverUrl", "()Ljava/lang/String;", "getDescription", "getEditorAnnotation", "getEndYear", "()I", "getFilmLength", "getGenres", "getHas3D", "getHasImax", "getImdbId", "getKinopoiskHDId", "getKinopoiskId", "getLastSync", "getLogoUrl", "getNameEn", "getNameOriginal", "getNameRu", "getPosterUrl", "getPosterUrlPreview", "getProductionStatus", "getRatingAgeLimits", "getRatingAwait", "()Ljava/lang/Number;", "getRatingAwaitCount", "getRatingFilmCritics", "getRatingFilmCriticsVoteCount", "getRatingGoodReview", "getRatingGoodReviewVoteCount", "getRatingImdb", "getRatingImdbVoteCount", "getRatingKinopoisk", "getRatingKinopoiskVoteCount", "getRatingMpaa", "getRatingRfCritics", "getRatingRfCriticsVoteCount", "getReviewsCount", "getSerial", "getShortDescription", "getShortFilm", "getSlogan", "getStartYear", "getType", "getWebUrl", "getYear", "app_debug"})
public final class DescriptionPagedListDto implements com.example.skillcinema.entity.description.DescriptionPagedList {
    private final int kinopoiskId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String kinopoiskHDId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imdbId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameRu = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameEn = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameOriginal = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posterUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posterUrlPreview = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coverUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String logoUrl = null;
    private final int reviewsCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingGoodReview = null;
    private final int ratingGoodReviewVoteCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingKinopoisk = null;
    private final int ratingKinopoiskVoteCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingImdb = null;
    private final int ratingImdbVoteCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingFilmCritics = null;
    private final int ratingFilmCriticsVoteCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingAwait = null;
    private final int ratingAwaitCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingRfCritics = null;
    private final int ratingRfCriticsVoteCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String webUrl = null;
    private final int year = 0;
    private final int filmLength = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slogan = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shortDescription = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String editorAnnotation = null;
    private final boolean isTicketsAvailable = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productionStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ratingMpaa = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ratingAgeLimits = null;
    private final boolean hasImax = false;
    private final boolean has3D = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lastSync = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.skillcinema.entity.description.Country> countries = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.skillcinema.entity.description.Genre> genres = null;
    private final int startYear = 0;
    private final int endYear = 0;
    private final boolean serial = false;
    private final boolean shortFilm = false;
    private final boolean completed = false;
    
    public DescriptionPagedListDto(int kinopoiskId, @org.jetbrains.annotations.NotNull()
    java.lang.String kinopoiskHDId, @org.jetbrains.annotations.NotNull()
    java.lang.String imdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String nameRu, @org.jetbrains.annotations.NotNull()
    java.lang.String nameEn, @org.jetbrains.annotations.NotNull()
    java.lang.String nameOriginal, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.NotNull()
    java.lang.String coverUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String logoUrl, int reviewsCount, @org.jetbrains.annotations.NotNull()
    java.lang.Number ratingGoodReview, int ratingGoodReviewVoteCount, @org.jetbrains.annotations.NotNull()
    java.lang.Number ratingKinopoisk, int ratingKinopoiskVoteCount, @org.jetbrains.annotations.NotNull()
    java.lang.Number ratingImdb, int ratingImdbVoteCount, @org.jetbrains.annotations.NotNull()
    java.lang.Number ratingFilmCritics, int ratingFilmCriticsVoteCount, @org.jetbrains.annotations.NotNull()
    java.lang.Number ratingAwait, int ratingAwaitCount, @org.jetbrains.annotations.NotNull()
    java.lang.Number ratingRfCritics, int ratingRfCriticsVoteCount, @org.jetbrains.annotations.NotNull()
    java.lang.String webUrl, int year, int filmLength, @org.jetbrains.annotations.NotNull()
    java.lang.String slogan, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String shortDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String editorAnnotation, boolean isTicketsAvailable, @org.jetbrains.annotations.NotNull()
    java.lang.String productionStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String ratingMpaa, @org.jetbrains.annotations.NotNull()
    java.lang.String ratingAgeLimits, boolean hasImax, boolean has3D, @org.jetbrains.annotations.NotNull()
    java.lang.String lastSync, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.skillcinema.entity.description.Country> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.skillcinema.entity.description.Genre> genres, int startYear, int endYear, boolean serial, boolean shortFilm, boolean completed) {
        super();
    }
    
    @java.lang.Override()
    public int getKinopoiskId() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getKinopoiskHDId() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getImdbId() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getNameRu() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getNameEn() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getNameOriginal() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPosterUrl() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPosterUrlPreview() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getCoverUrl() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLogoUrl() {
        return null;
    }
    
    @java.lang.Override()
    public int getReviewsCount() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Number getRatingGoodReview() {
        return null;
    }
    
    @java.lang.Override()
    public int getRatingGoodReviewVoteCount() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Number getRatingKinopoisk() {
        return null;
    }
    
    @java.lang.Override()
    public int getRatingKinopoiskVoteCount() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Number getRatingImdb() {
        return null;
    }
    
    @java.lang.Override()
    public int getRatingImdbVoteCount() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Number getRatingFilmCritics() {
        return null;
    }
    
    @java.lang.Override()
    public int getRatingFilmCriticsVoteCount() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Number getRatingAwait() {
        return null;
    }
    
    @java.lang.Override()
    public int getRatingAwaitCount() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Number getRatingRfCritics() {
        return null;
    }
    
    @java.lang.Override()
    public int getRatingRfCriticsVoteCount() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getWebUrl() {
        return null;
    }
    
    @java.lang.Override()
    public int getYear() {
        return 0;
    }
    
    @java.lang.Override()
    public int getFilmLength() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getSlogan() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getDescription() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getShortDescription() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getEditorAnnotation() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isTicketsAvailable() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getProductionStatus() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getType() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getRatingMpaa() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getRatingAgeLimits() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getHasImax() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getHas3D() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLastSync() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.skillcinema.entity.description.Country> getCountries() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.skillcinema.entity.description.Genre> getGenres() {
        return null;
    }
    
    @java.lang.Override()
    public int getStartYear() {
        return 0;
    }
    
    @java.lang.Override()
    public int getEndYear() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean getSerial() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getShortFilm() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getCompleted() {
        return false;
    }
}