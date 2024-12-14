package com.example.skillcinema.presentation.actorpage_directorpage_Fragment.director;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class DirectorFragmentDirections {
  private DirectorFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDirectorFragment2ToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_directorFragment2_to_filmpageFragment);
  }

  @NonNull
  public static NavDirections actionDirectorFragment2ToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_directorFragment2_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionDirectorFragment2ToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_directorFragment2_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionDirectorFragment2ToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_directorFragment2_to_profileFragment2);
  }
}
