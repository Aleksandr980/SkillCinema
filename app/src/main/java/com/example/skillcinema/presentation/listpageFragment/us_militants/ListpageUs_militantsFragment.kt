package com.example.skillcinema.presentation.listpageFragment.us_militants

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
import com.example.skillcinema.databinding.FragmentListpageUsMilitantsBinding
import com.example.skillcinema.entity.movie.Movie
import com.example.skillcinema.presentation.listpageFragment.MoviePagedListAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class ListpageUs_militantsFragment : Fragment() {
    private var _binding: FragmentListpageUsMilitantsBinding? = null
    private val binding get() = _binding!!

    private val viewModelUs_militants: MoviePagedListUs_militantsViewModel by viewModels()
    private val pagedAdapterUs_militants = MoviePagedListAdapter{ movie -> onItemClick(movie) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListpageUsMilitantsBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.usMilitants.adapter = pagedAdapterUs_militants

        viewModelUs_militants.pagedMoviesUs_militants.onEach {
            Log.d("ListpageUs_militantsFragment", "ListpageUs_militantsFragment  viewModelUs_militants.pagedMoviesUs_militants.onEach  $it")
            pagedAdapterUs_militants.submitData(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.strelkaNazad.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_listpageUs_militantsFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_listpageUs_militantsFragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_listpageUs_militantsFragment_to_profileFragment2)
        }
    }
    fun onItemClick(item: Movie) {
        Log.d("ListpageUs_militantsFragment", "ListpageUs_militantsFragment  onItemClick  $item")
        findNavController().navigate(R.id.filmpageFragment)
    }
    override fun onDestroyView() {
        Log.d("ListpageUs_militantsFragment", "ListpageUs_militantsFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}
