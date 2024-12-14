package com.example.skillcinema.presentation.listpageFragment.serials;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class ListpageSerialsFragmentDirections {
  private ListpageSerialsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListpageSerialsFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageSerialsFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionListpageSerialsFragmentToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageSerialsFragment_to_filmpageFragment);
  }

  @NonNull
  public static NavDirections actionListpageSerialsFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageSerialsFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionListpageSerialsFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_listpageSerialsFragment_to_profileFragment2);
  }
}
