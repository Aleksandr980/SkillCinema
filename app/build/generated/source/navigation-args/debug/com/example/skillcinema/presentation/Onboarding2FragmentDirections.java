package com.example.skillcinema.presentation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class Onboarding2FragmentDirections {
  private Onboarding2FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOnboarding2FragmentToOnboardingFragment() {
    return new ActionOnlyNavDirections(R.id.action_onboarding2Fragment_to_onboardingFragment);
  }

  @NonNull
  public static NavDirections actionOnboarding2FragmentToOnboarding3Fragment() {
    return new ActionOnlyNavDirections(R.id.action_onboarding2Fragment_to_onboarding3Fragment);
  }
}
