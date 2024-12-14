package com.example.skillcinema.presentation.seachFragment;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase;
import com.example.skillcinema.entity.movie.Movie;
import com.example.skillcinema.presentation.MoviePagedListRepository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0004J#\u0010\t\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0097@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/skillcinema/presentation/seachFragment/SeachPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/example/skillcinema/entity/movie/Movie;", "()V", "moviePagedListRepository", "Lcom/example/skillcinema/presentation/MoviePagedListRepository;", "repository", "Lcom/example/skillcinema/domain/GetMoviePagedListRepositoryUseCase;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class SeachPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.example.skillcinema.entity.movie.Movie> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.MoviePagedListRepository moviePagedListRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase repository = null;
    private static final int FIRST_PAGE = 1;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.skillcinema.presentation.seachFragment.SeachPagingSource.Companion Companion = null;
    
    public SeachPagingSource() {
        super();
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.example.skillcinema.entity.movie.Movie>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.example.skillcinema.entity.movie.Movie> state) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/skillcinema/presentation/seachFragment/SeachPagingSource$Companion;", "", "()V", "FIRST_PAGE", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}