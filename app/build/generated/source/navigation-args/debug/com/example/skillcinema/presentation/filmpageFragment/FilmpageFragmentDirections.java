package com.example.skillcinema.presentation.filmpageFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class FilmpageFragmentDirections {
  private FilmpageFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFilmpageFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_filmpageFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionFilmpageFragmentToActorpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_filmpageFragment_to_actorpageFragment);
  }

  @NonNull
  public static NavDirections actionFilmpageFragmentToDirectorFragment2() {
    return new ActionOnlyNavDirections(R.id.action_filmpageFragment_to_directorFragment2);
  }

  @NonNull
  public static NavDirections actionFilmpageFragmentToGalleryFragmentFrames() {
    return new ActionOnlyNavDirections(R.id.action_filmpageFragment_to_galleryFragmentFrames);
  }

  @NonNull
  public static NavDirections actionFilmpageFragmentToListpageSerialsFragment() {
    return new ActionOnlyNavDirections(R.id.action_filmpageFragment_to_listpageSerialsFragment);
  }

  @NonNull
  public static NavDirections actionFilmpageFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_filmpageFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionFilmpageFragmentToHomepageFragment2() {
    return new ActionOnlyNavDirections(R.id.action_filmpageFragment_to_homepageFragment2);
  }

  @NonNull
  public static NavDirections actionFilmpageFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_filmpageFragment_to_profileFragment2);
  }
}
