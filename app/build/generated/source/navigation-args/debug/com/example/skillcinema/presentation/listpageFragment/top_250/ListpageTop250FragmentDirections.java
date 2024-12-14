package com.example.skillcinema.presentation.listpageFragment.top_250;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class ListpageTop250FragmentDirections {
  private ListpageTop250FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListpageTop250FragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageTop250Fragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionListpageTop250FragmentToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageTop250Fragment_to_filmpageFragment);
  }

  @NonNull
  public static NavDirections actionListpageTop250FragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageTop250Fragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionListpageTop250FragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_listpageTop250Fragment_to_profileFragment2);
  }
}
