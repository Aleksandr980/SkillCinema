package com.example.skillcinema.presentation.homepageFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class HomepageFragmentDirections {
  private HomepageFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomepageFragmentToListpageSerialsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homepageFragment_to_listpageSerialsFragment);
  }

  @NonNull
  public static NavDirections actionHomepageFragmentToListpageTop250Fragment() {
    return new ActionOnlyNavDirections(R.id.action_homepageFragment_to_listpageTop250Fragment);
  }

  @NonNull
  public static NavDirections actionHomepageFragmentToListpageUsMilitantsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homepageFragment_to_listpageUs_militantsFragment);
  }

  @NonNull
  public static NavDirections actionHomepageFragmentToListpagePopularFragment() {
    return new ActionOnlyNavDirections(R.id.action_homepageFragment_to_listpagePopularFragment);
  }

  @NonNull
  public static NavDirections actionHomepageFragmentToListpagePremieresFragment() {
    return new ActionOnlyNavDirections(R.id.action_homepageFragment_to_listpagePremieresFragment);
  }

  @NonNull
  public static NavDirections actionHomepageFragmentToListpageDramasFranceFragment() {
    return new ActionOnlyNavDirections(R.id.action_homepageFragment_to_listpageDramas_franceFragment);
  }

  @NonNull
  public static NavDirections actionHomepageFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_homepageFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionHomepageFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_homepageFragment_to_profileFragment2);
  }
}
