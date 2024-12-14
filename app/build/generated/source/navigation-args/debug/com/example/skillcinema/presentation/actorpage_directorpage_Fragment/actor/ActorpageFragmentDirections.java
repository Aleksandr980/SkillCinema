package com.example.skillcinema.presentation.actorpage_directorpage_Fragment.actor;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.skillcinema.R;

public class ActorpageFragmentDirections {
  private ActorpageFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionActorpageFragmentToFilmpageFragment() {
    return new ActionOnlyNavDirections(R.id.action_actorpageFragment_to_filmpageFragment);
  }

  @NonNull
  public static NavDirections actionActorpageFragmentToSeachFragment() {
    return new ActionOnlyNavDirections(R.id.action_actorpageFragment_to_seachFragment);
  }

  @NonNull
  public static NavDirections actionActorpageFragmentToHomepageFragment() {
    return new ActionOnlyNavDirections(R.id.action_actorpageFragment_to_homepageFragment);
  }

  @NonNull
  public static NavDirections actionActorpageFragmentToProfileFragment2() {
    return new ActionOnlyNavDirections(R.id.action_actorpageFragment_to_profileFragment2);
  }
}
