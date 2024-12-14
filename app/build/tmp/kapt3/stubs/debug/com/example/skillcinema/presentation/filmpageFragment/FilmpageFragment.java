package com.example.skillcinema.presentation.filmpageFragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.skillcinema.R;
import com.example.skillcinema.databinding.FragmentFilmpageBinding;
import com.example.skillcinema.presentation.filmpageFragment.description.DescriptionMovieListViewModel;
import com.example.skillcinema.presentation.filmpageFragment.film_shot.ActorListAdapter;
import com.example.skillcinema.presentation.filmpageFragment.film_shot.ActorListViewModel;
import com.example.skillcinema.presentation.filmpageFragment.gallery.GalleryListAdapter;
import com.example.skillcinema.presentation.filmpageFragment.gallery.GalleryListViewModel;
import com.example.skillcinema.presentation.filmpageFragment.main_poster.MainPosterListAdapter;
import com.example.skillcinema.presentation.filmpageFragment.main_poster.MainPosterListViewModel;
import com.example.skillcinema.presentation.filmpageFragment.similars.SimilarsMovieListAdapter;
import com.example.skillcinema.presentation.filmpageFragment.similars.SimilarsMovieListViewModel;
import com.example.skillcinema.presentation.filmpageFragment.we_working_film.DirectorListAdapter;
import com.example.skillcinema.presentation.filmpageFragment.we_working_film.DirectorListViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0002J\u001a\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\b.\u0010/\u00a8\u0006A"}, d2 = {"Lcom/example/skillcinema/presentation/filmpageFragment/FilmpageFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/skillcinema/databinding/FragmentFilmpageBinding;", "adapterActor", "Lcom/example/skillcinema/presentation/filmpageFragment/film_shot/ActorListAdapter;", "adapterDirector", "Lcom/example/skillcinema/presentation/filmpageFragment/we_working_film/DirectorListAdapter;", "adapterGallery", "Lcom/example/skillcinema/presentation/filmpageFragment/gallery/GalleryListAdapter;", "adapterMainPoster", "Lcom/example/skillcinema/presentation/filmpageFragment/main_poster/MainPosterListAdapter;", "adapterSimilarsMovie", "Lcom/example/skillcinema/presentation/filmpageFragment/similars/SimilarsMovieListAdapter;", "binding", "getBinding", "()Lcom/example/skillcinema/databinding/FragmentFilmpageBinding;", "viewModelActor", "Lcom/example/skillcinema/presentation/filmpageFragment/film_shot/ActorListViewModel;", "getViewModelActor", "()Lcom/example/skillcinema/presentation/filmpageFragment/film_shot/ActorListViewModel;", "viewModelActor$delegate", "Lkotlin/Lazy;", "viewModelDescription", "Lcom/example/skillcinema/presentation/filmpageFragment/description/DescriptionMovieListViewModel;", "getViewModelDescription", "()Lcom/example/skillcinema/presentation/filmpageFragment/description/DescriptionMovieListViewModel;", "viewModelDescription$delegate", "viewModelDirector", "Lcom/example/skillcinema/presentation/filmpageFragment/we_working_film/DirectorListViewModel;", "getViewModelDirector", "()Lcom/example/skillcinema/presentation/filmpageFragment/we_working_film/DirectorListViewModel;", "viewModelDirector$delegate", "viewModelGallery", "Lcom/example/skillcinema/presentation/filmpageFragment/gallery/GalleryListViewModel;", "getViewModelGallery", "()Lcom/example/skillcinema/presentation/filmpageFragment/gallery/GalleryListViewModel;", "viewModelGallery$delegate", "viewModelMainPoster", "Lcom/example/skillcinema/presentation/filmpageFragment/main_poster/MainPosterListViewModel;", "getViewModelMainPoster", "()Lcom/example/skillcinema/presentation/filmpageFragment/main_poster/MainPosterListViewModel;", "viewModelMainPoster$delegate", "viewModelSimilarsMovie", "Lcom/example/skillcinema/presentation/filmpageFragment/similars/SimilarsMovieListViewModel;", "getViewModelSimilarsMovie", "()Lcom/example/skillcinema/presentation/filmpageFragment/similars/SimilarsMovieListViewModel;", "viewModelSimilarsMovie$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onItemClick", "position", "", "hash", "onViewCreated", "view", "app_debug"})
public final class FilmpageFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.skillcinema.databinding.FragmentFilmpageBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelMainPoster$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.filmpageFragment.main_poster.MainPosterListAdapter adapterMainPoster = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelActor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.filmpageFragment.film_shot.ActorListAdapter adapterActor = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelDirector$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.filmpageFragment.we_working_film.DirectorListAdapter adapterDirector = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelGallery$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.filmpageFragment.gallery.GalleryListAdapter adapterGallery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelSimilarsMovie$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.filmpageFragment.similars.SimilarsMovieListAdapter adapterSimilarsMovie = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelDescription$delegate = null;
    
    public FilmpageFragment() {
        super();
    }
    
    private final com.example.skillcinema.databinding.FragmentFilmpageBinding getBinding() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.filmpageFragment.main_poster.MainPosterListViewModel getViewModelMainPoster() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.filmpageFragment.film_shot.ActorListViewModel getViewModelActor() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.filmpageFragment.we_working_film.DirectorListViewModel getViewModelDirector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.skillcinema.presentation.filmpageFragment.gallery.GalleryListViewModel getViewModelGallery() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.filmpageFragment.similars.SimilarsMovieListViewModel getViewModelSimilarsMovie() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.filmpageFragment.description.DescriptionMovieListViewModel getViewModelDescription() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onItemClick(int position, int hash) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}