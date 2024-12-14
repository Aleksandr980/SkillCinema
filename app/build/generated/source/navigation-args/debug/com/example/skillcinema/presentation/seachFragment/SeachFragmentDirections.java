package com.example.skillcinema.presentation.seachFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class SeachFragmentDirections {
  private SeachFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSeachFragmentToSeachErrorFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachFragment_to_seachErrorFragment);
  }

  @NonNull
  public static NavDirections actionSeachFragmentToSeachFoundFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachFragment_to_seachFoundFragment);
  }

  @NonNull
  public static NavDirections actionSeachFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionSeachFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_seachFragment_to_profileFragment2);
  }
}
