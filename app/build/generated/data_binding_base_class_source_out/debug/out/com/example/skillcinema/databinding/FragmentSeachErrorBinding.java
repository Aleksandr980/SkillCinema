// Generated by view binder compiler. Do not edit!
package com.example.skillcinema.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.skillcinema.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSeachErrorBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final TextView errorSeach;

  @NonNull
  public final ImageButton filtr;

  @NonNull
  public final ImageView imageContact;

  @NonNull
  public final ImageView imageHome;

  @NonNull
  public final ImageView imagePoisk;

  @NonNull
  public final TextView searchEditText;

  @NonNull
  public final ImageView searchRectangle;

  private FragmentSeachErrorBinding(@NonNull FrameLayout rootView, @NonNull CardView cardView2,
      @NonNull TextView errorSeach, @NonNull ImageButton filtr, @NonNull ImageView imageContact,
      @NonNull ImageView imageHome, @NonNull ImageView imagePoisk, @NonNull TextView searchEditText,
      @NonNull ImageView searchRectangle) {
    this.rootView = rootView;
    this.cardView2 = cardView2;
    this.errorSeach = errorSeach;
    this.filtr = filtr;
    this.imageContact = imageContact;
    this.imageHome = imageHome;
    this.imagePoisk = imagePoisk;
    this.searchEditText = searchEditText;
    this.searchRectangle = searchRectangle;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSeachErrorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSeachErrorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_seach_error, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSeachErrorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.errorSeach;
      TextView errorSeach = ViewBindings.findChildViewById(rootView, id);
      if (errorSeach == null) {
        break missingId;
      }

      id = R.id.filtr;
      ImageButton filtr = ViewBindings.findChildViewById(rootView, id);
      if (filtr == null) {
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

      id = R.id.searchEditText;
      TextView searchEditText = ViewBindings.findChildViewById(rootView, id);
      if (searchEditText == null) {
        break missingId;
      }

      id = R.id.searchRectangle;
      ImageView searchRectangle = ViewBindings.findChildViewById(rootView, id);
      if (searchRectangle == null) {
        break missingId;
      }

      return new FragmentSeachErrorBinding((FrameLayout) rootView, cardView2, errorSeach, filtr,
          imageContact, imageHome, imagePoisk, searchEditText, searchRectangle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}