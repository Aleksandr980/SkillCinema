package com.example.skillcinema.presentation.listpageFragment.premieres

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
import com.example.skillcinema.databinding.FragmentListpagePremieresBinding
import com.example.skillcinema.entity.movie.Movie
import com.example.skillcinema.presentation.listpageFragment.MoviePagedListAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class ListpagePremieresFragment : Fragment() {
    private var _binding: FragmentListpagePremieresBinding? = null
    private val binding get() = _binding!!

    private val viewModelPremieres: MoviePagedListPremieresViewModel by viewModels()
    private val pagedAdapterPremieres = MoviePagedListAdapter { movie -> onItemClick(movie) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListpagePremieresBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.premieres.adapter = pagedAdapterPremieres

        viewModelPremieres.pagedMoviesPremieres.onEach {
            Log.d("ListpagePremieresFragment", "ListpagePremieresFragment viewModelPremieres.pagedMoviesPremieres.onEach $it")
            pagedAdapterPremieres.submitData(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.strelkaNazad.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_listpagePremieresFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_listpagePremieresFragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_listpagePremieresFragment_to_profileFragment2)
        }
    }
    fun onItemClick(item: Movie) {
        Log.d("ListpagePremieresFragment", "ListpagePremieresFragment onItemClick $item")
        findNavController().navigate(R.id.filmpageFragment)
    }
    override fun onDestroyView() {
        Log.d("ListpagePremieresFragment", "ListpagePremieresFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}