package com.example.skillcinema.presentation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class OnboardingFragmentDirections {
  private OnboardingFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOnboardingFragmentToOnboarding2Fragment() {
    return new ActionOnlyNavDirections(R.id.action_onboardingFragment_to_onboarding2Fragment);
  }
}
