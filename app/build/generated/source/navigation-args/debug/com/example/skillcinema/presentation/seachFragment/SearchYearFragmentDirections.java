package com.example.skillcinema.presentation.seachFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class SearchYearFragmentDirections {
  private SearchYearFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSearchYearFragmentToSeachFoundFragment() {
    return new ActionOnlyNavDirections(R.id.action_searchYearFragment_to_seachFoundFragment);
  }
}
