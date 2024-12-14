package com.example.skillcinema.presentation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class LoaderFragmentDirections {
  private LoaderFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoaderFragmentToOnboarding3Fragment() {
    return new ActionOnlyNavDirections(R.id.action_loaderFragment_to_onboarding3Fragment);
  }

  @NonNull
  public static NavDirections actionLoaderFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_loaderFragment_to_homepageFragment);
  }
}
