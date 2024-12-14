// Generated by view binder compiler. Do not edit!
package com.example.skillcinema.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.skillcinema.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentListpagePremieresBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final ImageView imageContact;

  @NonNull
  public final ImageView imageHome;

  @NonNull
  public final ImageView imagePoisk;

  @NonNull
  public final TextView listPremieres;

  @NonNull
  public final RecyclerView premieres;

  @NonNull
  public final ImageView strelkaNazad;

  private FragmentListpagePremieresBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardView2, @NonNull ImageView imageContact, @NonNull ImageView imageHome,
      @NonNull ImageView imagePoisk, @NonNull TextView listPremieres,
      @NonNull RecyclerView premieres, @NonNull ImageView strelkaNazad) {
    this.rootView = rootView;
    this.cardView2 = cardView2;
    this.imageContact = imageContact;
    this.imageHome = imageHome;
    this.imagePoisk = imagePoisk;
    this.listPremieres = listPremieres;
    this.premieres = premieres;
    this.strelkaNazad = strelkaNazad;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentListpagePremieresBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentListpagePremieresBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_listpage_premieres, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentListpagePremieresBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.imageContact;
      ImageView imageContact = ViewBindings.findChildViewById(rootView, id);
      if (imageContact == null) {
        break missingId;
      }

      id = R.id.imageHome;
      ImageView imageHome = ViewBindings.findChildViewById(rootView, id);
      if (imageHome == null) {
        break missingId;
      }

      id = R.id.imagePoisk;
      ImageView imagePoisk = ViewBindings.findChildViewById(rootView, id);
      if (imagePoisk == null) {
        break missingId;
      }

      id = R.id.list_premieres;
      TextView listPremieres = ViewBindings.findChildViewById(rootView, id);
      if (listPremieres == null) {
        break missingId;
      }

      id = R.id.premieres;
      RecyclerView premieres = ViewBindings.findChildViewById(rootView, id);
      if (premieres == null) {
        break missingId;
      }

      id = R.id.strelkaNazad;
      ImageView strelkaNazad = ViewBindings.findChildViewById(rootView, id);
      if (strelkaNazad == null) {
        break missingId;
      }

      return new FragmentListpagePremieresBinding((ConstraintLayout) rootView, cardView2,
          imageContact, imageHome, imagePoisk, listPremieres, premieres, strelkaNazad);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
