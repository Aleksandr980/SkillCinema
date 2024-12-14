package com.example.skillcinema.presentation.profile;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class ProfileCustomFragmentDirections {
  private ProfileCustomFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionProfileCustomFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_profileCustomFragment_to_profileFragment2);
  }

  @NonNull
  public static NavDirections actionProfileCustomFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileCustomFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionProfileCustomFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileCustomFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionProfileCustomFragmentToListpagePremieresFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileCustomFragment_to_listpagePremieresFragment);
  }

  @NonNull
  public static NavDirections actionProfileCustomFragmentToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileCustomFragment_to_filmpageFragment);
  }
}
