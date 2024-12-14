package com.example.skillcinema.presentation.listpageFragment.premieres;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class ListpagePremieresFragmentDirections {
  private ListpagePremieresFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListpagePremieresFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpagePremieresFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionListpagePremieresFragmentToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpagePremieresFragment_to_filmpageFragment);
  }

  @NonNull
  public static NavDirections actionListpagePremieresFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpagePremieresFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionListpagePremieresFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_listpagePremieresFragment_to_profileFragment2);
  }
}
