package com.example.skillcinema.presentation.galleryFromFilms;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.skillcinema.R;
import com.example.skillcinema.databinding.FragmentGalleryFromFilmsBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0002J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0002J\u001a\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006%"}, d2 = {"Lcom/example/skillcinema/presentation/galleryFromFilms/GalleryPostersToFromFilmsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/skillcinema/databinding/FragmentGalleryFromFilmsBinding;", "adapterGalleryPostersToFromFilmsFragment", "Lcom/example/skillcinema/presentation/galleryFromFilms/GalleryPostersToFromFilmsFragmentAdapter;", "binding", "getBinding", "()Lcom/example/skillcinema/databinding/FragmentGalleryFromFilmsBinding;", "buttonAdapter2_2", "Lcom/example/skillcinema/presentation/galleryFromFilms/ButtonPostersToFromFilmsAdapter;", "countGallery1", "", "countGallery3", "viewModelGalleryPostersToFromFilmsFragment", "Lcom/example/skillcinema/presentation/galleryFromFilms/GalleryPostersToFromFilmsFragmentViewModel;", "getViewModelGalleryPostersToFromFilmsFragment", "()Lcom/example/skillcinema/presentation/galleryFromFilms/GalleryPostersToFromFilmsFragmentViewModel;", "viewModelGalleryPostersToFromFilmsFragment$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onItemClick3", "position", "hash", "onItemClick4", "onViewCreated", "view", "app_debug"})
public final class GalleryPostersToFromFilmsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.skillcinema.databinding.FragmentGalleryFromFilmsBinding _binding;
    private int countGallery1 = 0;
    private int countGallery3 = 0;
    private com.example.skillcinema.presentation.galleryFromFilms.ButtonPostersToFromFilmsAdapter buttonAdapter2_2;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelGalleryPostersToFromFilmsFragment$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.galleryFromFilms.GalleryPostersToFromFilmsFragmentAdapter adapterGalleryPostersToFromFilmsFragment = null;
    
    public GalleryPostersToFromFilmsFragment() {
        super();
    }
    
    private final com.example.skillcinema.databinding.FragmentGalleryFromFilmsBinding getBinding() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.galleryFromFilms.GalleryPostersToFromFilmsFragmentViewModel getViewModelGalleryPostersToFromFilmsFragment() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
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
    
    private final void onItemClick3(int position, int hash) {
    }
    
    private final void onItemClick4(int position, int hash) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}