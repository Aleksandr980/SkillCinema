package com.example.skillcinema.presentation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class Onboarding3FragmentDirections {
  private Onboarding3FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOnboarding3FragmentToOnboarding2Fragment() {
    return new ActionOnlyNavDirections(R.id.action_onboarding3Fragment_to_onboarding2Fragment);
  }

  @NonNull
  public static NavDirections actionOnboarding3FragmentToLoaderFragment() {
    return new ActionOnlyNavDirections(R.id.action_onboarding3Fragment_to_loaderFragment);
  }
}
