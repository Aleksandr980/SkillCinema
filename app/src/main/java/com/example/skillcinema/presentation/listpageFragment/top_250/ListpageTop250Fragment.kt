package com.example.skillcinema.presentation.listpageFragment.top_250

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
import com.example.skillcinema.databinding.FragmentListpageTop250Binding
import com.example.skillcinema.entity.movie.Movie
import com.example.skillcinema.presentation.listpageFragment.MoviePagedListAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class ListpageTop250Fragment : Fragment() {
    private var _binding: FragmentListpageTop250Binding? = null
    private val binding get() = _binding!!

    private val viewModelTop250: MoviePagedListTop250ViewModel by viewModels()
    private val pagedAdapterTop250 = MoviePagedListAdapter{ movie -> onItemClick(movie) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListpageTop250Binding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.top250.adapter = pagedAdapterTop250

        viewModelTop250.pagedMoviesTop250.onEach {
            Log.d("ListpageTop250Fragment", "ListpageTop250Fragment   viewModelTop250.pagedMoviesTop250.onEach $it")
            pagedAdapterTop250.submitData(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.strelkaNazad.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_listpageTop250Fragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_listpageTop250Fragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_listpageTop250Fragment_to_profileFragment2)
        }
    }
    fun onItemClick(item: Movie) {
        Log.d("ListpageTop250Fragment", "ListpageTop250Fragment   onItemClick $item")
        findNavController().navigate(R.id.filmpageFragment)
    }
    override fun onDestroyView() {
        Log.d("ListpageTop250Fragment", "ListpageTop250Fragment DestroyView")
        super.onDestroyView()
        _binding = null
    }

}


