package com.example.skillcinema.presentation.seachFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class SeachFoundFragmentDirections {
  private SeachFoundFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSeachFoundFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachFoundFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionSeachFoundFragmentToSearchCountryFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachFoundFragment_to_searchCountryFragment);
  }

  @NonNull
  public static NavDirections actionSeachFoundFragmentToSearchGenreFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachFoundFragment_to_searchGenreFragment);
  }

  @NonNull
  public static NavDirections actionSeachFoundFragmentToSearchYearFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachFoundFragment_to_searchYearFragment);
  }

  @NonNull
  public static NavDirections actionSeachFoundFragmentToSeachErrorFragment() {
    return new ActionOnlyNavDirections(R.id.action_seachFoundFragment_to_seachErrorFragment);
  }
}
