// Generated by view binder compiler. Do not edit!
package com.example.skillcinema.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.skillcinema.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchYearBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView back1;

  @NonNull
  public final ImageView back2;

  @NonNull
  public final Button choice;

  @NonNull
  public final ImageView forward1;

  @NonNull
  public final ImageView forward2;

  @NonNull
  public final RecyclerView recyclerView1;

  @NonNull
  public final RecyclerView recyclerView2;

  @NonNull
  public final FrameLayout seachYearFragment;

  @NonNull
  public final ImageView strelkaNazad;

  private FragmentSearchYearBinding(@NonNull FrameLayout rootView, @NonNull ImageView back1,
      @NonNull ImageView back2, @NonNull Button choice, @NonNull ImageView forward1,
      @NonNull ImageView forward2, @NonNull RecyclerView recyclerView1,
      @NonNull RecyclerView recyclerView2, @NonNull FrameLayout seachYearFragment,
      @NonNull ImageView strelkaNazad) {
    this.rootView = rootView;
    this.back1 = back1;
    this.back2 = back2;
    this.choice = choice;
    this.forward1 = forward1;
    this.forward2 = forward2;
    this.recyclerView1 = recyclerView1;
    this.recyclerView2 = recyclerView2;
    this.seachYearFragment = seachYearFragment;
    this.strelkaNazad = strelkaNazad;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchYearBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchYearBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search_year, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchYearBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back1;
      ImageView back1 = ViewBindings.findChildViewById(rootView, id);
      if (back1 == null) {
        break missingId;
      }

      id = R.id.back2;
      ImageView back2 = ViewBindings.findChildViewById(rootView, id);
      if (back2 == null) {
        break missingId;
      }

      id = R.id.choice;
      Button choice = ViewBindings.findChildViewById(rootView, id);
      if (choice == null) {
        break missingId;
      }

      id = R.id.forward1;
      ImageView forward1 = ViewBindings.findChildViewById(rootView, id);
      if (forward1 == null) {
        break missingId;
      }

      id = R.id.forward2;
      ImageView forward2 = ViewBindings.findChildViewById(rootView, id);
      if (forward2 == null) {
        break missingId;
      }

      id = R.id.recycler_view1;
      RecyclerView recyclerView1 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView1 == null) {
        break missingId;
      }

      id = R.id.recycler_view2;
      RecyclerView recyclerView2 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView2 == null) {
        break missingId;
      }

      FrameLayout seachYearFragment = (FrameLayout) rootView;

      id = R.id.strelkaNazad;
      ImageView strelkaNazad = ViewBindings.findChildViewById(rootView, id);
      if (strelkaNazad == null) {
        break missingId;
      }

      return new FragmentSearchYearBinding((FrameLayout) rootView, back1, back2, choice, forward1,
          forward2, recyclerView1, recyclerView2, seachYearFragment, strelkaNazad);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}