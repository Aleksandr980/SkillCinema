package com.example.skillcinema.presentation.galleryFromFilms;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class GalleryFramesToFromFilmsFragmentDirections {
  private GalleryFramesToFromFilmsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGalleryFromFilmsFragmentToGalleryFragmentFrames() {
    return new ActionOnlyNavDirections(R.id.action_galleryFromFilmsFragment_to_galleryFragmentFrames);
  }

  @NonNull
  public static NavDirections actionGalleryFromFilmsFragmentToGalleryFragmentPosters() {
    return new ActionOnlyNavDirections(R.id.action_galleryFromFilmsFragment_to_galleryFragmentPosters);
  }

  @NonNull
  public static NavDirections actionGalleryFromFilmsFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryFromFilmsFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionGalleryFromFilmsFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryFromFilmsFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionGalleryFromFilmsFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_galleryFromFilmsFragment_to_profileFragment2);
  }
}
