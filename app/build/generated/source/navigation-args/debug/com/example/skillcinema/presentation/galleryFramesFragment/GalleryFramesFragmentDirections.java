package com.example.skillcinema.presentation.galleryFramesFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class GalleryFramesFragmentDirections {
  private GalleryFramesFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGalleryFragmentFramesToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentFrames_to_filmpageFragment);
  }

  @NonNull
  public static NavDirections actionGalleryFragmentFramesToGalleryFromFilmsFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentFrames_to_galleryFromFilmsFragment);
  }

  @NonNull
  public static NavDirections actionGalleryFragmentFramesToGalleryFragmentPosters() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentFrames_to_galleryFragmentPosters);
  }

  @NonNull
  public static NavDirections actionGalleryFragmentFramesToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentFrames_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionGalleryFragmentFramesToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentFrames_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionGalleryFragmentFramesToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_galleryFragmentFrames_to_profileFragment2);
  }
}
