package com.example.skillcinema.presentation.actorpage_directorpage_Fragment.actor

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentActorpageBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
class ActorpageFragment : Fragment() {
    private var _binding: FragmentActorpageBinding? = null
    private val binding get() = _binding!!

    private val topMovieByActorViewModel: TopMovieByActorViewModel by viewModels()
    private val topMovieByActorAdaptor =
        TopMovieByActorAdaptor { position, hash -> onItemClick(position, hash) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentActorpageBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listFilmRecyclerAct.adapter = topMovieByActorAdaptor
        val arguments = arguments

        val actorStaffId = arguments?.getString("actorStaffId")
        val actorPocter = arguments?.getString("actorPocter")
        Log.d("ActorpageFragment", "ActorpageFragment actorPocter = $actorPocter")
        val nameActor = arguments?.getString("nameActor")
        Log.d("ActorpageFragment", "ActorpageFragment nameActor = $nameActor")
        val professionActor = arguments?.getString("professionActor")
        Log.d("ActorpageFragment", "ActorpageFragment professionActor = $professionActor")

        val staffId = actorStaffId?.toInt()
        staffId.let {
            if (it != null) {
                topMovieByActorViewModel.loadTopMovieByActor(staffId!!)
            }
        }

        val nameA = nameActor
        val professionA = professionActor
        val aPocter = actorPocter
        binding.nameAct.text = nameA
        binding.professionAct.text = professionA
        Glide
            .with(binding.posterAct.context)
            .load(aPocter)
            .into(binding.posterAct)

        binding.imageBack.setOnClickListener {
            findNavController().popBackStack()
        }


        binding.listFilmRecyclerAct.setOnClickListener {
            findNavController().navigate(R.id.filmpageFragment)
        }

        topMovieByActorViewModel.filmAct.onEach {
            Log.d("ActorpageFragment", "ActorpageFragment  topMovieByActorViewModel.film.onEach == $it")

            binding.countFilmAct.text = it.size.toString()
            Log.d("ActorpageFragment", "ActorpageFragment  topMovieByActorViewModel.film.onEach size == ${it.size.toString()}")
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_actorpageFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_actorpageFragment_to_seachFragment)
        }

        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_actorpageFragment_to_profileFragment2)
        }

    }

    private fun onItemClick(position: Int, hash: Int) {

    }

    override fun onDestroyView() {
        Log.d("ActorpageFragment", "ActorpageFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }

}
