package com.example.skillcinema.presentation.listpageFragment.dramas_france

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentListpageDramasFranceBinding
import com.example.skillcinema.entity.movie.Movie
import com.example.skillcinema.presentation.listpageFragment.MoviePagedListAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class ListpageDramas_franceFragment: Fragment() {
    private var _binding: FragmentListpageDramasFranceBinding? = null
    private val binding get() = _binding!!

    private val viewModelDramas_france: MoviePagedListDramas_franceViewModel by viewModels()
    private val pagedAdapterDramas_france = MoviePagedListAdapter { movie -> onItemClick(movie) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListpageDramasFranceBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.dramasFrance.adapter = pagedAdapterDramas_france

        viewModelDramas_france.pagedMoviesDramas_france.onEach {
            Log.d("ListpageDramas_franceFragment", "ListpageDramas_franceFragment  viewModelDramas_france.pagedMoviesDramas_france.onEach $it")
            pagedAdapterDramas_france.submitData(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)
        binding.strelkaNazad.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_listpageDramas_franceFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_listpageDramas_franceFragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_listpageDramas_franceFragment_to_profileFragment2)
        }
    }
    fun onItemClick(item: Movie) {
        Log.d("ListpageDramas_franceFragment", "ListpageDramas_franceFragment  onItemClick $item")
        findNavController().navigate(R.id.filmpageFragment)
    }
    override fun onDestroyView() {
        Log.d("ListpageDramas_franceFragment", "ListpageDramas_franceFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}