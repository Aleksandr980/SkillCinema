package com.example.skillcinema.presentation.seachFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class SearchCountryFragmentDirections {
  private SearchCountryFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSearchCountryFragmentToSeachFoundFragment() {
    return new ActionOnlyNavDirections(R.id.action_searchCountryFragment_to_seachFoundFragment);
  }
}
