package com.example.skillcinema.presentation.listpageFragment.dramas_france;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class ListpageDramas_franceFragmentDirections {
  private ListpageDramas_franceFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListpageDramasFranceFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageDramas_franceFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionListpageDramasFranceFragmentToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageDramas_franceFragment_to_filmpageFragment);
  }

  @NonNull
  public static NavDirections actionListpageDramasFranceFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_listpageDramas_franceFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionListpageDramasFranceFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_listpageDramas_franceFragment_to_profileFragment2);
  }
}
