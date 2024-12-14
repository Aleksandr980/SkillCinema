package com.example.skillcinema.entity.description;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0004\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bh\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00f9\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010\'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000-\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020$\u0012\u0006\u00104\u001a\u00020$\u0012\u0006\u00105\u001a\u00020$\u00a2\u0006\u0002\u00106J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\t\u0010k\u001a\u00020\u0010H\u00c6\u0003J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\t\u0010m\u001a\u00020\u0010H\u00c6\u0003J\t\u0010n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010o\u001a\u00020\u0010H\u00c6\u0003J\t\u0010p\u001a\u00020\u0003H\u00c6\u0003J\t\u0010q\u001a\u00020\u0010H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u0005H\u00c6\u0003J\t\u0010t\u001a\u00020\u0010H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\t\u0010v\u001a\u00020\u0010H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\u0005H\u00c6\u0003J\t\u0010y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010{\u001a\u00020\u0005H\u00c6\u0003J\t\u0010|\u001a\u00020\u0005H\u00c6\u0003J\t\u0010}\u001a\u00020\u0005H\u00c6\u0003J\t\u0010~\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020$H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020$H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020$H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020.0-H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u0002000-H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020$H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020$H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020$H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0005H\u00c6\u0003J\u00d8\u0003\u0010\u0095\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020\u00052\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u0002000-2\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00104\u001a\u00020$2\b\b\u0002\u00105\u001a\u00020$H\u00c6\u0001J\n\u0010\u0096\u0001\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010\u0097\u0001\u001a\u00020$2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u00d6\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u009b\u0001\u001a\u00020\u0005H\u00d6\u0001J\u001e\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u00a0\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0016\u00105\u001a\u00020$8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0016\u0010\"\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0016\u00102\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u0002000-8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0016\u0010*\u001a\u00020$8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00108R\u0016\u0010)\u001a\u00020$8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00108R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010<R\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u00108R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010<R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010@R\u0016\u0010+\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010<R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010<R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010<R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010<R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010<R\u0016\u0010%\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010<R\u0016\u0010(\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010<R\u0016\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010@R\u0016\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010RR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010@R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010RR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010@R\u0016\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010RR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010@R\u0016\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010RR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010@R\u0016\u0010\'\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010<R\u0016\u0010\u001a\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010RR\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010@R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010@R\u0016\u00103\u001a\u00020$8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u00108R\u0016\u0010!\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010<R\u0016\u00104\u001a\u00020$8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u00108R\u0016\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010<R\u0016\u00101\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010@R\u0016\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010<R\u0016\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010<R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010@\u00a8\u0006\u00a1\u0001"}, d2 = {"Lcom/example/skillcinema/entity/description/Description;", "Landroid/os/Parcelable;", "kinopoiskId", "", "kinopoiskHDId", "", "imdbId", "nameRu", "nameEn", "nameOriginal", "posterUrl", "posterUrlPreview", "coverUrl", "logoUrl", "reviewsCount", "ratingGoodReview", "", "ratingGoodReviewVoteCount", "ratingKinopoisk", "ratingKinopoiskVoteCount", "ratingImdb", "ratingImdbVoteCount", "ratingFilmCritics", "ratingFilmCriticsVoteCount", "ratingAwait", "ratingAwaitCount", "ratingRfCritics", "ratingRfCriticsVoteCount", "webUrl", "year", "filmLength", "slogan", "description", "shortDescription", "editorAnnotation", "isTicketsAvailable", "", "productionStatus", "type", "ratingMpaa", "ratingAgeLimits", "hasImax", "has3D", "lastSync", "countries", "", "Lcom/example/skillcinema/entity/description/Country;", "genres", "Lcom/example/skillcinema/entity/description/Genre;", "startYear", "endYear", "serial", "shortFilm", "completed", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/Number;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;IIZZZ)V", "getCompleted", "()Z", "getCountries", "()Ljava/util/List;", "getCoverUrl", "()Ljava/lang/String;", "getDescription", "getEditorAnnotation", "getEndYear", "()I", "getFilmLength", "getGenres", "getHas3D", "getHasImax", "getImdbId", "getKinopoiskHDId", "getKinopoiskId", "getLastSync", "getLogoUrl", "getNameEn", "getNameOriginal", "getNameRu", "getPosterUrl", "getPosterUrlPreview", "getProductionStatus", "getRatingAgeLimits", "getRatingAwait", "()Ljava/lang/Number;", "getRatingAwaitCount", "getRatingFilmCritics", "getRatingFilmCriticsVoteCount", "getRatingGoodReview", "getRatingGoodReviewVoteCount", "getRatingImdb", "getRatingImdbVoteCount", "getRatingKinopoisk", "getRatingKinopoiskVoteCount", "getRatingMpaa", "getRatingRfCritics", "getRatingRfCriticsVoteCount", "getReviewsCount", "getSerial", "getShortDescription", "getShortFilm", "getSlogan", "getStartYear", "getType", "getWebUrl", "getYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize()
public final class Description implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "kinopoiskId")
    private final int kinopoiskId = 0;
    @com.google.gson.annotations.SerializedName(value = "kinopoiskHDId")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String kinopoiskHDId = null;
    @com.google.gson.annotations.SerializedName(value = "imdbId")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imdbId = null;
    @com.google.gson.annotations.SerializedName(value = "nameRu")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameRu = null;
    @com.google.gson.annotations.SerializedName(value = "nameEn")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameEn = null;
    @com.google.gson.annotations.SerializedName(value = "nameOriginal")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameOriginal = null;
    @com.google.gson.annotations.SerializedName(value = "posterUrl")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posterUrl = null;
    @com.google.gson.annotations.SerializedName(value = "posterUrlPreview")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posterUrlPreview = null;
    @com.google.gson.annotations.SerializedName(value = "coverUrl")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coverUrl = null;
    @com.google.gson.annotations.SerializedName(value = "logoUrl")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String logoUrl = null;
    @com.google.gson.annotations.SerializedName(value = "reviewsCount")
    private final int reviewsCount = 0;
    @com.google.gson.annotations.SerializedName(value = "ratingGoodReview")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingGoodReview = null;
    @com.google.gson.annotations.SerializedName(value = "ratingGoodReviewVoteCount")
    private final int ratingGoodReviewVoteCount = 0;
    @com.google.gson.annotations.SerializedName(value = "ratingKinopoisk")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingKinopoisk = null;
    @com.google.gson.annotations.SerializedName(value = "ratingKinopoiskVoteCount")
    private final int ratingKinopoiskVoteCount = 0;
    @com.google.gson.annotations.SerializedName(value = "ratingImdb")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingImdb = null;
    @com.google.gson.annotations.SerializedName(value = "ratingImdbVoteCount")
    private final int ratingImdbVoteCount = 0;
    @com.google.gson.annotations.SerializedName(value = "ratingFilmCritics")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingFilmCritics = null;
    @com.google.gson.annotations.SerializedName(value = "ratingFilmCriticsVoteCount")
    private final int ratingFilmCriticsVoteCount = 0;
    @com.google.gson.annotations.SerializedName(value = "ratingAwait")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingAwait = null;
    @com.google.gson.annotations.SerializedName(value = "ratingAwaitCount")
    private final int ratingAwaitCount = 0;
    @com.google.gson.annotations.SerializedName(value = "ratingRfCritics")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Number ratingRfCritics = null;
    @com.google.gson.annotations.SerializedName(value = "ratingRfCriticsVoteCount")
    private final int ratingRfCriticsVoteCount = 0;
    @com.google.gson.annotations.SerializedName(value = "webUrl")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String webUrl = null;
    @com.google.gson.annotations.SerializedName(value = "year")
    private final int year = 0;
    @com.google.gson.annotations.SerializedName(value = "filmLength")
    private final int filmLength = 0;
    @com.google.gson.annotations.SerializedName(value = "slogan")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slogan = null;
    @com.google.gson.annotations.SerializedName(value = "description")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @com.google.gson.annotations.SerializedName(value = "shortDescription")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shortDescription = null;
    @com.google.gson.annotations.SerializedName(value = "editorAnnotation")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String editorAnnotation = null;
    @com.google.gson.annotations.SerializedName(value = "isTicketsAvailable")
    private final boolean isTicketsAvailable = false;
    @com.google.gson.annotations.SerializedName(value = "productionStatus")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productionStatus = null;
    @com.google.gson.annotations.SerializedName(value = "type")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @com.google.gson.annotations.SerializedName(value = "ratingMpaa")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ratingMpaa = null;
    @com.google.gson.annotations.SerializedName(value = "ratingAgeLimits")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ratingAgeLimits = null;
    @com.google.gson.annotations.SerializedName(value = "hasImax")
    private final boolean hasImax = false;
    @com.google.gson.annotations.SerializedName(value = "has3D")
    private final boolean has3D = false;
    @com.google.gson.annotations.SerializedName(value = "lastSync")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lastSync = null;
    @com.google.gson.annotations.SerializedName(value = "countries")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.skillcinema.entity.description.Country> countries = null;
    @com.google.gson.annotations.SerializedName(value = "genres")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.skillcinema.entity.description.Genre> genres = null;
    @com.google.gson.annotations.SerializedName(value = "startYear")
    private final int startYear = 0;
    @com.google.gson.annotations.SerializedName(value = "endYear")
    private final int endYear = 0;
    @com.google.gson.annotations.SerializedName(value = "serial")
    private final boolean serial = false;
    @com.google.gson.annotations.SerializedName(value = "shortFilm")
    private final boolean shortFilm = false;
    @com.google.gson.annotations.SerializedName(value = "completed")
    private final boolean completed = false;
    
    public Description(int kinopoiskId, @org.jetbrains.annotations.NotNull()
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
    
    public final int getKinopoiskId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKinopoiskHDId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameRu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameEn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameOriginal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosterUrlPreview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoverUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogoUrl() {
        return null;
    }
    
    public final int getReviewsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number getRatingGoodReview() {
        return null;
    }
    
    public final int getRatingGoodReviewVoteCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number getRatingKinopoisk() {
        return null;
    }
    
    public final int getRatingKinopoiskVoteCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number getRatingImdb() {
        return null;
    }
    
    public final int getRatingImdbVoteCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number getRatingFilmCritics() {
        return null;
    }
    
    public final int getRatingFilmCriticsVoteCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number getRatingAwait() {
        return null;
    }
    
    public final int getRatingAwaitCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number getRatingRfCritics() {
        return null;
    }
    
    public final int getRatingRfCriticsVoteCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebUrl() {
        return null;
    }
    
    public final int getYear() {
        return 0;
    }
    
    public final int getFilmLength() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlogan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShortDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEditorAnnotation() {
        return null;
    }
    
    public final boolean isTicketsAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRatingMpaa() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRatingAgeLimits() {
        return null;
    }
    
    public final boolean getHasImax() {
        return false;
    }
    
    public final boolean getHas3D() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastSync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.skillcinema.entity.description.Country> getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.skillcinema.entity.description.Genre> getGenres() {
        return null;
    }
    
    public final int getStartYear() {
        return 0;
    }
    
    public final int getEndYear() {
        return 0;
    }
    
    public final boolean getSerial() {
        return false;
    }
    
    public final boolean getShortFilm() {
        return false;
    }
    
    public final boolean getCompleted() {
        return false;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number component14() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number component16() {
        return null;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number component18() {
        return null;
    }
    
    public final int component19() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number component20() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number component22() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final int component26() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    public final boolean component31() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component35() {
        return null;
    }
    
    public final boolean component36() {
        return false;
    }
    
    public final boolean component37() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.skillcinema.entity.description.Country> component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.skillcinema.entity.description.Genre> component40() {
        return null;
    }
    
    public final int component41() {
        return 0;
    }
    
    public final int component42() {
        return 0;
    }
    
    public final boolean component43() {
        return false;
    }
    
    public final boolean component44() {
        return false;
    }
    
    public final boolean component45() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.skillcinema.entity.description.Description copy(int kinopoiskId, @org.jetbrains.annotations.NotNull()
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
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
}