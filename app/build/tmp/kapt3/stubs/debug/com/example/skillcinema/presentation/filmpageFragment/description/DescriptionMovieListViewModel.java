package com.example.skillcinema.presentation.filmpageFragment.description;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.skillcinema.data.DescriptionPagedListDto;
import com.example.skillcinema.domain.GetDescriptionMoviePagedListRepositoryUseCase;
import com.example.skillcinema.entity.description.Country;
import com.example.skillcinema.entity.description.Genre;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/skillcinema/presentation/filmpageFragment/description/DescriptionMovieListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "getDescriptionMoviePagedListRepositoryUseCase", "Lcom/example/skillcinema/domain/GetDescriptionMoviePagedListRepositoryUseCase;", "(Lcom/example/skillcinema/domain/GetDescriptionMoviePagedListRepositoryUseCase;)V", "_descriptionMovies", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isLoading", "", "descriptionMovies", "Lkotlinx/coroutines/flow/StateFlow;", "getDescriptionMovies", "()Lkotlinx/coroutines/flow/StateFlow;", "getGetDescriptionMoviePagedListRepositoryUseCase", "()Lcom/example/skillcinema/domain/GetDescriptionMoviePagedListRepositoryUseCase;", "isLoading", "loadDescription", "", "id", "", "app_debug"})
public final class DescriptionMovieListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.domain.GetDescriptionMoviePagedListRepositoryUseCase getDescriptionMoviePagedListRepositoryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _descriptionMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> descriptionMovies = null;
    
    private DescriptionMovieListViewModel(com.example.skillcinema.domain.GetDescriptionMoviePagedListRepositoryUseCase getDescriptionMoviePagedListRepositoryUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.skillcinema.domain.GetDescriptionMoviePagedListRepositoryUseCase getGetDescriptionMoviePagedListRepositoryUseCase() {
        return null;
    }
    
    public DescriptionMovieListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getDescriptionMovies() {
        return null;
    }
    
    public final void loadDescription(int id) {
    }
}