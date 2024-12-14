package com.example.skillcinema.presentation.galleryFromFilms;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class GalleryPostersToFromFilmsFragmentDirections {
  private GalleryPostersToFromFilmsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGalleryPostersToFromFilmsFragmentToGalleryFragmentPosters() {
    return new ActionOnlyNavDirections(R.id.action_galleryPostersToFromFilmsFragment_to_galleryFragmentPosters);
  }

  @NonNull
  public static NavDirections actionGalleryPostersToFromFilmsFragmentToGalleryFragmentFrames() {
    return new ActionOnlyNavDirections(R.id.action_galleryPostersToFromFilmsFragment_to_galleryFragmentFrames);
  }

  @NonNull
  public static NavDirections actionGalleryPostersToFromFilmsFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryPostersToFromFilmsFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionGalleryPostersToFromFilmsFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryPostersToFromFilmsFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionGalleryPostersToFromFilmsFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_galleryPostersToFromFilmsFragment_to_profileFragment2);
  }
}
