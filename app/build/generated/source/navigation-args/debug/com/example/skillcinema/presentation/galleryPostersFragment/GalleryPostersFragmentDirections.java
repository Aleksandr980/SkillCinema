package com.example.skillcinema.presentation.galleryPostersFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class GalleryPostersFragmentDirections {
  private GalleryPostersFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGalleryFragmentPostersToGalleryPostersToFromFilmsFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentPosters_to_galleryPostersToFromFilmsFragment);
  }

  @NonNull
  public static NavDirections actionGalleryFragmentPostersToGalleryFragmentFrames() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentPosters_to_galleryFragmentFrames);
  }

  @NonNull
  public static NavDirections actionGalleryFragmentPostersToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentPosters_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionGalleryFragmentPostersToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentPosters_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionGalleryFragmentPostersToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentPosters_to_profileFragment2);
  }
}
