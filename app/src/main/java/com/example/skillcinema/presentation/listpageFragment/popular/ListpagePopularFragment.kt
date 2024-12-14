package com.example.skillcinema.presentation.listpageFragment.popular

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
import com.example.skillcinema.databinding.FragmentListpagePopularBinding
import com.example.skillcinema.entity.movie.Movie
import com.example.skillcinema.presentation.listpageFragment.MoviePagedListAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class ListpagePopularFragment: Fragment() {
    private var _binding: FragmentListpagePopularBinding? = null
    private val binding get() = _binding!!

    private val viewModelPopular: MoviePagedListPopularViewModel by viewModels()
    private val pagedAdapterPopular = MoviePagedListAdapter { movie -> onItemClick(movie) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListpagePopularBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.popular.adapter = pagedAdapterPopular

        viewModelPopular.pagedMoviesPopular.onEach {
            Log.d("ListpagePopularFragment", "ListpagePopularFragment  viewModelPopular.pagedMoviesPopular.onEach $it")
            pagedAdapterPopular.submitData(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.strelkaNazad.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_listpagePopularFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_listpagePopularFragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_listpagePopularFragment_to_profileFragment2)
        }
    }
    fun onItemClick(item: Movie) {
        Log.d("ListpagePopularFragment", "ListpagePopularFragment  onItemClick $item")
        findNavController().navigate(R.id.filmpageFragment)
    }
    override fun onDestroyView() {
        Log.d("ListpagePopularFragment", "ListpagePopularFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}