package com.example.skillcinema.presentation.seachFragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentSeachBinding
import com.example.skillcinema.entity.movie.Movie
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class SeachFragment : Fragment() {

    private var _binding: FragmentSeachBinding? = null
    private val binding get() = _binding!!

    private val seachViewModel: SeachViewModel by viewModels()
    private val seachAdapter = SeachAdapter{ movie -> onItemClick(movie) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeachBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.filmRecycler.adapter = seachAdapter

        seachViewModel.pagedMoviesPopular.onEach {
            Log.d("SeachFragment", "SeachFragment     seachViewModel.pagedMoviesPopular.onEach $it")
            seachAdapter.submitData(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.searchEditText.setOnClickListener{
            findNavController().navigate(R.id.action_seachFragment_to_seachErrorFragment)
        }
        binding.filtr.setOnClickListener{
            val bundle = Bundle()
            bundle.putInt("periodBefore", 1977)
            bundle.putInt("periodAfter", 2024)
            findNavController().navigate(R.id.action_seachFragment_to_seachFoundFragment, bundle)
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_seachFragment_to_homepageFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_seachFragment_to_profileFragment2)
        }
    }
    fun onItemClick(item: Movie) {}
    override fun onDestroyView() {
        Log.d("SeachFragment", "SeachFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}