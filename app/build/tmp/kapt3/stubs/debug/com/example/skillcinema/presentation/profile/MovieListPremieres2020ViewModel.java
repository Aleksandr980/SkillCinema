package com.example.skillcinema.presentation.profile;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase;
import com.example.skillcinema.entity.movie.Movie;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/example/skillcinema/presentation/profile/MovieListPremieres2020ViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "getMoviePagedListRepositoryUseCase", "Lcom/example/skillcinema/domain/GetMoviePagedListRepositoryUseCase;", "(Lcom/example/skillcinema/domain/GetMoviePagedListRepositoryUseCase;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_movies", "", "Lcom/example/skillcinema/entity/movie/Movie;", "getGetMoviePagedListRepositoryUseCase", "()Lcom/example/skillcinema/domain/GetMoviePagedListRepositoryUseCase;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "movies", "getMovies", "loadPremieres2020", "", "app_debug"})
public final class MovieListPremieres2020ViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase getMoviePagedListRepositoryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.skillcinema.entity.movie.Movie>> _movies = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.skillcinema.entity.movie.Movie>> movies = null;
    
    private MovieListPremieres2020ViewModel(com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase getMoviePagedListRepositoryUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.skillcinema.domain.GetMoviePagedListRepositoryUseCase getGetMoviePagedListRepositoryUseCase() {
        return null;
    }
    
    public MovieListPremieres2020ViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.skillcinema.entity.movie.Movie>> getMovies() {
        return null;
    }
    
    private final void loadPremieres2020() {
    }
}