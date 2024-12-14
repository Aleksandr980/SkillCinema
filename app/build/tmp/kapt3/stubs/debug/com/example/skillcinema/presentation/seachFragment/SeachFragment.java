package com.example.skillcinema.presentation.seachFragment;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.skillcinema.R;
import com.example.skillcinema.databinding.FragmentSeachBinding;
import com.example.skillcinema.entity.movie.Movie;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u001a\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/example/skillcinema/presentation/seachFragment/SeachFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/skillcinema/databinding/FragmentSeachBinding;", "binding", "getBinding", "()Lcom/example/skillcinema/databinding/FragmentSeachBinding;", "seachAdapter", "Lcom/example/skillcinema/presentation/seachFragment/SeachAdapter;", "seachViewModel", "Lcom/example/skillcinema/presentation/seachFragment/SeachViewModel;", "getSeachViewModel", "()Lcom/example/skillcinema/presentation/seachFragment/SeachViewModel;", "seachViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onItemClick", "item", "Lcom/example/skillcinema/entity/movie/Movie;", "onViewCreated", "view", "app_debug"})
public final class SeachFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.skillcinema.databinding.FragmentSeachBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy seachViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.skillcinema.presentation.seachFragment.SeachAdapter seachAdapter = null;
    
    public SeachFragment() {
        super();
    }
    
    private final com.example.skillcinema.databinding.FragmentSeachBinding getBinding() {
        return null;
    }
    
    private final com.example.skillcinema.presentation.seachFragment.SeachViewModel getSeachViewModel() {
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
    
    public final void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.skillcinema.entity.movie.Movie item) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}