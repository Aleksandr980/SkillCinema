package com.example.skillcinema.presentation.listpageFragment.serials

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
import com.example.skillcinema.databinding.FragmentListpageSerialsBinding
import com.example.skillcinema.entity.movie.Movie
import com.example.skillcinema.presentation.listpageFragment.MoviePagedListAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class ListpageSerialsFragment : Fragment() {
    private var _binding: FragmentListpageSerialsBinding? = null
    private val binding get() = _binding!!

    private val viewModelSerials: MoviePagedListSerialsViewModel by viewModels()
    private val pagedAdapterSerials = MoviePagedListAdapter { movie -> onItemClick(movie) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListpageSerialsBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.serials.adapter = pagedAdapterSerials

        viewModelSerials.pagedMoviesSerials.onEach {
            Log.d("ListpageSerialsFragment", "ListpageSerialsFragment viewModelSerials.pagedMoviesSerials.onEach $it")
            pagedAdapterSerials.submitData(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.strelkaNazad.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_listpageSerialsFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_listpageSerialsFragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_listpageSerialsFragment_to_profileFragment2)
        }
    }
    fun onItemClick(item: Movie) {
     val id = item.kinopoiskId
        val bundle = Bundle()
        bundle.putInt("filmId", id!!)
        findNavController().navigate(R.id.action_listpageSerialsFragment_to_filmpageFragment,
            bundle)
    }
    override fun onDestroyView() {
        Log.d("ListpageSerialsFragment", "ListpageSerialsFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}