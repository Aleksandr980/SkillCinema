package com.example.skillcinema.presentation.filmpageFragment.similars;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.skillcinema.domain.GetSimilarsMoviePagedListRepositoryUseCase;
import com.example.skillcinema.entity.similarsMovie.SimilarsMovie;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u0017R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/example/skillcinema/presentation/filmpageFragment/similars/SimilarsMovieListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "getSimilarsMoviePagedListRepositoryUseCase", "Lcom/example/skillcinema/domain/GetSimilarsMoviePagedListRepositoryUseCase;", "(Lcom/example/skillcinema/domain/GetSimilarsMoviePagedListRepositoryUseCase;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_similarsMovies", "", "Lcom/example/skillcinema/entity/similarsMovie/SimilarsMovie;", "getGetSimilarsMoviePagedListRepositoryUseCase", "()Lcom/example/skillcinema/domain/GetSimilarsMoviePagedListRepositoryUseCase;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "similarsMovies", "getSimilarsMovies", "loadSimilars", "", "id", "", "(Ljava/lang/Integer;)V", "app_debug"})
public final class SimilarsMovieListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.domain.GetSimilarsMoviePagedListRepositoryUseCase getSimilarsMoviePagedListRepositoryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.skillcinema.entity.similarsMovie.SimilarsMovie>> _similarsMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.skillcinema.entity.similarsMovie.SimilarsMovie>> similarsMovies = null;
    
    private SimilarsMovieListViewModel(com.example.skillcinema.domain.GetSimilarsMoviePagedListRepositoryUseCase getSimilarsMoviePagedListRepositoryUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.skillcinema.domain.GetSimilarsMoviePagedListRepositoryUseCase getGetSimilarsMoviePagedListRepositoryUseCase() {
        return null;
    }
    
    public SimilarsMovieListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.skillcinema.entity.similarsMovie.SimilarsMovie>> getSimilarsMovies() {
        return null;
    }
    
    public final void loadSimilars(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
    }
}