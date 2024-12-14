package com.example.skillcinema.presentation.listpageFragment.us_militants;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class ListpageUs_militantsFragmentDirections {
  private ListpageUs_militantsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListpageUsMilitantsFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageUs_militantsFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionListpageUsMilitantsFragmentToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageUs_militantsFragment_to_filmpageFragment);
  }

  @NonNull
  public static NavDirections actionListpageUsMilitantsFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageUs_militantsFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionListpageUsMilitantsFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_listpageUs_militantsFragment_to_profileFragment2);
  }
}
