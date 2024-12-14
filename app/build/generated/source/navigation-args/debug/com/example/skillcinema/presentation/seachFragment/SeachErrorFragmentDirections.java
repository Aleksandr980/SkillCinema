package com.example.skillcinema.presentation.seachFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class SeachErrorFragmentDirections {
  private SeachErrorFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSeachErrorFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachErrorFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionSeachErrorFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachErrorFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionSeachErrorFragmentToSeachFoundFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachErrorFragment_to_seachFoundFragment);
  }

  @NonNull
  public static NavDirections actionSeachErrorFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_seachErrorFragment_to_profileFragment2);
  }
}
