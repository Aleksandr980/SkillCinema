package com.example.skillcinema.presentation.profile

import android.annotation.SuppressLint
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
import com.example.skillcinema.databinding.FragmentProfileCustomBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class ProfileCustomFragment : Fragment() {
    private var _binding: FragmentProfileCustomBinding? = null
    private val binding get() = _binding!!

    private val viewModelPremieres2024: MovieListPremieres2024ViewModel by viewModels()
    private val viewModelPremieres2020: MovieListPremieres2020ViewModel by viewModels()
    private val adapterPremieres2020 =
        MovieListPremieres2020Adapter { position, hash -> lifecycleScope.launch { onItemClick(position, hash) } }
    private val adapterPremieres2024 =
        MovieListPremieres2024Adapter { position, hash -> lifecycleScope.launch { onItemClick(position, hash) } }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileCustomBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewedRecycler.adapter = adapterPremieres2024
        binding.interestingRecycler.adapter = adapterPremieres2020

        viewModelPremieres2024.movies.onEach {
            adapterPremieres2024.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        viewModelPremieres2020.movies.onEach {
            adapterPremieres2020.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)





        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_profileCustomFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_profileCustomFragment_to_seachFragment)
        }

    }
    private fun onItemClick(position: Int, hash: Int) {
        val bundle = Bundle()
        when (hash) {
            adapterPremieres2020.hashCode() -> if (position == 19) {
                findNavController().navigate(R.id.action_profileCustomFragment_to_listpagePremieresFragment)
            } else {
                val selectedFilmsPremieres2020 = viewModelPremieres2020.movies.value[position]
                val selectedFilmsIdPremieres2020 = selectedFilmsPremieres2020.kinopoiskId
                bundle.putInt("filmId", selectedFilmsIdPremieres2020)
                findNavController().navigate(R.id.action_profileCustomFragment_to_filmpageFragment, bundle)
                Log.d(
                    "ProfileCustomFragment",
                    "ProfileCustomFragment onItemClick   selectedFilmsIdPremieres2020 = $selectedFilmsIdPremieres2020"
                )
            }
            adapterPremieres2024.hashCode() -> if (position == 19) {
                findNavController().navigate(R.id.action_profileCustomFragment_to_listpagePremieresFragment)
            } else {
                val selectedFilmsPremieres2024 = viewModelPremieres2024.movies.value[position]
                val selectedFilmsIdPremieres2024 = selectedFilmsPremieres2024.kinopoiskId
                bundle.putInt("filmId", selectedFilmsIdPremieres2024)
                findNavController().navigate(R.id.action_profileCustomFragment_to_filmpageFragment, bundle)
                Log.d(
                    "ProfileCustomFragment",
                    "ProfileCustomFragment onItemClick   selectedFilmsIdPremieres2024 = $selectedFilmsIdPremieres2024"
                )
            }
        }

    }
    override fun onDestroyView() {
        Log.d("ProfileCustomFragment", "ProfileCustomFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}