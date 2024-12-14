package com.example.skillcinema.presentation.listpageFragment.popular;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class ListpagePopularFragmentDirections {
  private ListpagePopularFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListpagePopularFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpagePopularFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionListpagePopularFragmentToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpagePopularFragment_to_filmpageFragment);
  }

  @NonNull
  public static NavDirections actionListpagePopularFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpagePopularFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionListpagePopularFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_listpagePopularFragment_to_profileFragment2);
  }
}
