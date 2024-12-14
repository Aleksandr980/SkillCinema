package com.example.skillcinema.presentation.actorpage_directorpage_Fragment.director;

import androidx.lifecycle.ViewModel;
import com.example.skillcinema.domain.GetTopMovieByDirectorRepositoryUseCase;
import kotlinx.coroutines.Dispatchers;
import android.util.Log;
import com.example.skillcinema.entity.actor_person.PersonResponse_films;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/skillcinema/presentation/actorpage_directorpage_Fragment/director/TopMovieByDirectorViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "getTopMovieByDirectorRepositoryUseCase", "Lcom/example/skillcinema/domain/GetTopMovieByDirectorRepositoryUseCase;", "(Lcom/example/skillcinema/domain/GetTopMovieByDirectorRepositoryUseCase;)V", "_filmDir", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/skillcinema/entity/actor_person/PersonResponse_films;", "_isLoading", "", "filmDir", "Lkotlinx/coroutines/flow/StateFlow;", "getFilmDir", "()Lkotlinx/coroutines/flow/StateFlow;", "getGetTopMovieByDirectorRepositoryUseCase", "()Lcom/example/skillcinema/domain/GetTopMovieByDirectorRepositoryUseCase;", "isLoading", "loadTopMovieByDirector", "", "staffId", "", "app_debug"})
public final class TopMovieByDirectorViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.domain.GetTopMovieByDirectorRepositoryUseCase getTopMovieByDirectorRepositoryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_films>> _filmDir = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_films>> filmDir = null;
    
    private TopMovieByDirectorViewModel(com.example.skillcinema.domain.GetTopMovieByDirectorRepositoryUseCase getTopMovieByDirectorRepositoryUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.skillcinema.domain.GetTopMovieByDirectorRepositoryUseCase getGetTopMovieByDirectorRepositoryUseCase() {
        return null;
    }
    
    public TopMovieByDirectorViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_films>> getFilmDir() {
        return null;
    }
    
    public final void loadTopMovieByDirector(int staffId) {
    }
}