package com.example.skillcinema.presentation.homepageFragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.skillcinema.R;
import com.example.skillcinema.databinding.FragmentHomepageBinding;
import com.example.skillcinema.presentation.homepageFragment.dramas_france.MovieListDramasFranceViewModel;
import com.example.skillcinema.presentation.homepageFragment.popular.MovieListPopularViewModel;
import com.example.skillcinema.presentation.homepageFragment.premieres.MovieListPremieresViewModel;
import com.example.skillcinema.presentation.homepageFragment.serials.MovieListSerialsViewModel;
import com.example.skillcinema.presentation.homepageFragment.top_250.MovieListTop250ViewModel;
import com.example.skillcinema.presentation.homepageFragment.us_militants.MovieListUs_militantsViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u000207H\u0016J\u0018\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0002J\u001a\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u0014\u001a\u0004\b&\u0010\'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\u0014\u001a\u0004\b+\u0010,\u00a8\u0006>"}, d2 = {"Lcom/example/skillcinema/presentation/homepageFragment/HomepageFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/skillcinema/databinding/FragmentHomepageBinding;", "adapterDramasFrance", "Lcom/example/skillcinema/presentation/homepageFragment/MovieListAdapter;", "adapterPopular", "adapterPremieres", "adapterSerials", "adapterTop250", "adapterUsMilitants", "binding", "getBinding", "()Lcom/example/skillcinema/databinding/FragmentHomepageBinding;", "viewModelDramasFrance", "Lcom/example/skillcinema/presentation/homepageFragment/dramas_france/MovieListDramasFranceViewModel;", "getViewModelDramasFrance", "()Lcom/example/skillcinema/presentation/homepageFragment/dramas_france/MovieListDramasFranceViewModel;", "viewModelDramasFrance$delegate", "Lkotlin/Lazy;", "viewModelPopular", "Lcom/example/skillcinema/presentation/homepageFragment/popular/MovieListPopularViewModel;", "getViewModelPopular", "()Lcom/example/skillcinema/presentation/homepageFragment/popular/MovieListPopularViewModel;", "viewModelPopular$delegate", "viewModelPremieres", "Lcom/example/skillcinema/presentation/homepageFragment/premieres/MovieListPremieresViewModel;", "getViewModelPremieres", "()Lcom/example/skillcinema/presentation/homepageFragment/premieres/MovieListPremieresViewModel;", "viewModelPremieres$delegate", "viewModelSerials", "Lcom/example/skillcinema/presentation/homepageFragment/serials/MovieListSerialsViewModel;", "getViewModelSerials", "()Lcom/example/skillcinema/presentation/homepageFragment/serials/MovieListSerialsViewModel;", "viewModelSerials$delegate", "viewModelTop250", "Lcom/example/skillcinema/presentation/homepageFragment/top_250/MovieListTop250ViewModel;", "getViewModelTop250", "()Lcom/example/skillcinema/presentation/homepageFragment/top_250/MovieListTop250ViewModel;", "viewModelTop250$delegate", "viewModelUs_militants", "Lcom/example/skillcinema/presentation/homepageFragment/us_militants/MovieListUs_militantsViewModel;", "getViewModelUs_militants", "()Lcom/example/skillcinema/presentation/homepageFragment/us_militants/MovieListUs_militantsViewModel;", "viewModelUs_militants$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onItemClick", "position", "", "hash", "onViewCreated", "view", "app_debug"})
public final class HomepageFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.skillcinema.databinding.FragmentHomepageBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelDramasFrance$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelPopular$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelPremieres$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelSerials$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelTop250$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelUs_militants$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.homepageFragment.MovieListAdapter adapterDramasFrance = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.homepageFragment.MovieListAdapter adapterPopular = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.homepageFragment.MovieListAdapter adapterPremieres = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.homepageFragment.MovieListAdapter adapterSerials = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.homepageFragment.MovieListAdapter adapterTop250 = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.homepageFragment.MovieListAdapter adapterUsMilitants = null;
    
    public HomepageFragment() {
        super();
    }
    
    private final com.example.skillcinema.databinding.FragmentHomepageBinding getBinding() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.homepageFragment.dramas_france.MovieListDramasFranceViewModel getViewModelDramasFrance() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.homepageFragment.popular.MovieListPopularViewModel getViewModelPopular() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.homepageFragment.premieres.MovieListPremieresViewModel getViewModelPremieres() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.homepageFragment.serials.MovieListSerialsViewModel getViewModelSerials() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.homepageFragment.top_250.MovieListTop250ViewModel getViewModelTop250() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.homepageFragment.us_militants.MovieListUs_militantsViewModel getViewModelUs_militants() {
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