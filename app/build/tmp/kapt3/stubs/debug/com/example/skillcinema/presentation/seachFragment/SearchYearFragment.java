package com.example.skillcinema.presentation.seachFragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.skillcinema.R;
import com.example.skillcinema.databinding.FragmentSearchYearBinding;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0017J\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u0019J\u001a\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u0019R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/example/skillcinema/presentation/seachFragment/SearchYearFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/skillcinema/databinding/FragmentSearchYearBinding;", "binding", "getBinding", "()Lcom/example/skillcinema/databinding/FragmentSearchYearBinding;", "currentPage1", "", "currentPage2", "endYear1", "endYear2", "itemsPerPage1", "itemsPerPage2", "selectedYear1", "Ljava/lang/Integer;", "selectedYear2", "startYear1", "startYear2", "yearAdapter1", "Lcom/example/skillcinema/presentation/seachFragment/YearAdapter;", "yearAdapter2", "yearList1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "yearList2", "loadYears1", "", "loadYears2", "onClick1", "year", "onClick2", "onClickChoice", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "yearArray1", "yearArray2", "app_debug"})
public final class SearchYearFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.skillcinema.databinding.FragmentSearchYearBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.Integer> yearList1;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.Integer> yearList2;
    @org.jetbrains.annotations.NotNull()
    private com.example.skillcinema.presentation.seachFragment.YearAdapter yearAdapter1;
    private final int startYear1 = 1977;
    private final int endYear1 = 2024;
    private final int itemsPerPage1 = 12;
    private int currentPage1 = 0;
    @org.jetbrains.annotations.NotNull()
    private com.example.skillcinema.presentation.seachFragment.YearAdapter yearAdapter2;
    private final int startYear2 = 1977;
    private final int endYear2 = 2024;
    private final int itemsPerPage2 = 12;
    private int currentPage2 = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedYear1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedYear2;
    
    public SearchYearFragment() {
        super();
    }
    
    private final com.example.skillcinema.databinding.FragmentSearchYearBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Integer> yearArray1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Integer> yearArray2() {
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
    
    private final void onClick1(int year) {
    }
    
    private final void onClick2(int year) {
    }
    
    private final void onClickChoice() {
    }
    
    public final void loadYears1() {
    }
    
    public final void loadYears2() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}