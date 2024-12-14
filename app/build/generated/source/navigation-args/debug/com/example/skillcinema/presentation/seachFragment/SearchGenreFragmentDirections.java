package com.example.skillcinema.presentation.seachFragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class SearchGenreFragmentDirections {
  private SearchGenreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSearchGenreFragmentToSeachFoundFragment() {
    return new ActionOnlyNavDirections(R.id.action_searchGenreFragment_to_seachFoundFragment);
  }
}
