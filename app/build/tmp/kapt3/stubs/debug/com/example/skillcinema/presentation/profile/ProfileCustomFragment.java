package com.example.skillcinema.presentation.profile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.skillcinema.R;
import com.example.skillcinema.databinding.FragmentProfileCustomBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u001a\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\'"}, d2 = {"Lcom/example/skillcinema/presentation/profile/ProfileCustomFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/skillcinema/databinding/FragmentProfileCustomBinding;", "adapterPremieres2020", "Lcom/example/skillcinema/presentation/profile/MovieListPremieres2020Adapter;", "adapterPremieres2024", "Lcom/example/skillcinema/presentation/profile/MovieListPremieres2024Adapter;", "binding", "getBinding", "()Lcom/example/skillcinema/databinding/FragmentProfileCustomBinding;", "viewModelPremieres2020", "Lcom/example/skillcinema/presentation/profile/MovieListPremieres2020ViewModel;", "getViewModelPremieres2020", "()Lcom/example/skillcinema/presentation/profile/MovieListPremieres2020ViewModel;", "viewModelPremieres2020$delegate", "Lkotlin/Lazy;", "viewModelPremieres2024", "Lcom/example/skillcinema/presentation/profile/MovieListPremieres2024ViewModel;", "getViewModelPremieres2024", "()Lcom/example/skillcinema/presentation/profile/MovieListPremieres2024ViewModel;", "viewModelPremieres2024$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onItemClick", "position", "", "hash", "onViewCreated", "view", "app_debug"})
public final class ProfileCustomFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.skillcinema.databinding.FragmentProfileCustomBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelPremieres2024$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelPremieres2020$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.profile.MovieListPremieres2020Adapter adapterPremieres2020 = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.profile.MovieListPremieres2024Adapter adapterPremieres2024 = null;
    
    public ProfileCustomFragment() {
        super();
    }
    
    private final com.example.skillcinema.databinding.FragmentProfileCustomBinding getBinding() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.profile.MovieListPremieres2024ViewModel getViewModelPremieres2024() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.profile.MovieListPremieres2020ViewModel getViewModelPremieres2020() {
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
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
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