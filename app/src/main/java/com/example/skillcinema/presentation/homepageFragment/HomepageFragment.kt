package com.example.skillcinema.presentation.homepageFragment

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
import com.example.skillcinema.databinding.FragmentHomepageBinding
import com.example.skillcinema.presentation.homepageFragment.dramas_france.MovieListDramasFranceViewModel
import com.example.skillcinema.presentation.homepageFragment.popular.MovieListPopularViewModel
import com.example.skillcinema.presentation.homepageFragment.premieres.MovieListPremieresViewModel
import com.example.skillcinema.presentation.homepageFragment.serials.MovieListSerialsViewModel
import com.example.skillcinema.presentation.homepageFragment.top_250.MovieListTop250ViewModel
import com.example.skillcinema.presentation.homepageFragment.us_militants.MovieListUs_militantsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomepageFragment : Fragment() {

    private var _binding: FragmentHomepageBinding? = null
    private val binding get() = _binding!!

    private val viewModelDramasFrance: MovieListDramasFranceViewModel by viewModels()
    private val viewModelPopular: MovieListPopularViewModel by viewModels()
    private val viewModelPremieres: MovieListPremieresViewModel by viewModels()
    private val viewModelSerials: MovieListSerialsViewModel by viewModels()
    private val viewModelTop250: MovieListTop250ViewModel by viewModels()
    private val viewModelUs_militants: MovieListUs_militantsViewModel by viewModels()

    private val adapterDramasFrance =
        MovieListAdapter { position, hash -> lifecycleScope.launch { onItemClick(position, hash) } }
    private val adapterPopular =
        MovieListAdapter { position, hash -> lifecycleScope.launch { onItemClick(position, hash) } }
    private val adapterPremieres =
        MovieListAdapter { position, hash -> lifecycleScope.launch { onItemClick(position, hash) } }
    private val adapterSerials =
        MovieListAdapter { position, hash -> lifecycleScope.launch { onItemClick(position, hash) } }
    private val adapterTop250 =
        MovieListAdapter { position, hash -> lifecycleScope.launch { onItemClick(position, hash) } }
    private val adapterUsMilitants =
        MovieListAdapter { position, hash -> lifecycleScope.launch { onItemClick(position, hash) } }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomepageBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.dramasFrance.adapter = adapterDramasFrance
        binding.popular.adapter = adapterPopular
        binding.premieres.adapter = adapterPremieres
        binding.serials.adapter = adapterSerials
        binding.top250.adapter = adapterTop250
        binding.usMilitants.adapter = adapterUsMilitants

        fun progressIsLoad() {
            when {
                viewModelUs_militants.isLoading.value -> binding.progressBar.setVisibility(View.INVISIBLE)
                viewModelPopular.isLoading.value -> binding.progressBar.setVisibility(View.INVISIBLE)
                viewModelPremieres.isLoading.value -> binding.progressBar.setVisibility(View.INVISIBLE)
                viewModelSerials.isLoading.value -> binding.progressBar.setVisibility(View.INVISIBLE)
                viewModelTop250.isLoading.value -> binding.progressBar.setVisibility(View.INVISIBLE)
                viewModelDramasFrance.isLoading.value -> binding.progressBar.setVisibility(View.INVISIBLE)
                else -> binding.progressBar.setVisibility(View.VISIBLE)
            }
        }
        progressIsLoad()

        viewModelDramasFrance.movies.onEach {
            Log.d("HomepageFragment", "HomepageFragment  viewModelDramasFrance.movies.onEach $it")
            adapterDramasFrance.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        viewModelPopular.movies.onEach {
            Log.d("HomepageFragment", "HomepageFragment viewModelPopular.movies.onEach  $it")
            adapterPopular.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        viewModelPremieres.movies.onEach {
            Log.d("HomepageFragment", "HomepageFragment  viewModelPremieres.movies.onEach $it")
            adapterPremieres.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        viewModelSerials.movies.onEach {
            Log.d("HomepageFragment", "HomepageFragment viewModelSerials.movies.onEach $it")
            adapterSerials.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        viewModelTop250.movies.onEach {
            Log.d("HomepageFragment", "HomepageFragment viewModelTop250.movies.onEach $it")
            adapterTop250.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        viewModelUs_militants.movies.onEach {
            Log.d("HomepageFragment", "HomepageFragment  viewModelUs_militants.movies.onEach $it")
            adapterUsMilitants.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)



        binding.vseSerial.setOnClickListener {
            findNavController().navigate(R.id.listpageSerialsFragment)
        }
        binding.vseTop.setOnClickListener {
            findNavController().navigate(R.id.listpageTop250Fragment)
        }
        binding.vseUsMilitant.setOnClickListener {
            findNavController().navigate(R.id.listpageUs_militantsFragment)
        }
        binding.vsePopulars.setOnClickListener {
            findNavController().navigate(R.id.listpagePopularFragment)
        }
        binding.vsePremier.setOnClickListener {
            findNavController().navigate(R.id.listpagePremieresFragment)
        }
        binding.vseDramaFrance.setOnClickListener {
            findNavController().navigate(R.id.listpageDramas_franceFragment)
        }

        binding.imageHome.setOnClickListener {

        }
        binding.imagePoisk.setOnClickListener {
        findNavController().navigate(R.id.action_homepageFragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_homepageFragment_to_profileFragment2)
        }
    }

    private fun onItemClick(position: Int, hash: Int) {
        val bundle = Bundle()
        when (hash) {
            adapterDramasFrance.hashCode() -> if (position == 19) {
                findNavController().navigate(R.id.listpagePopularFragment)
            } else {
                val selectedFilmsDramasFrance = viewModelDramasFrance.movies.value[position]
                val selectedFilmsIdDramasFrance = selectedFilmsDramasFrance.kinopoiskId
                bundle.putInt("filmId", selectedFilmsIdDramasFrance)
                findNavController().navigate(R.id.filmpageFragment, bundle)
                Log.d(
                    "HomepageFragment",
                    "HomepageFragment onItemClick   selectedFilmsIdDramasFrance = $selectedFilmsIdDramasFrance"
                )
            }

            adapterPopular.hashCode() -> if (position == 19) {
                findNavController().navigate(R.id.listpagePopularFragment)
            } else {
                val selectedFilmsPopular = viewModelPopular.movies.value[position]
                val selectedFilmsIdPopular = selectedFilmsPopular.kinopoiskId
                bundle.putInt("filmId", selectedFilmsIdPopular)
                findNavController().navigate(R.id.filmpageFragment, bundle)
                Log.d(
                    "HomepageFragment",
                    "HomepageFragment onItemClick   selectedFilmsIdPopular = $selectedFilmsIdPopular"
                )
            }

            adapterPremieres.hashCode() -> if (position == 19) {
                findNavController().navigate(R.id.listpagePremieresFragment)
            } else {
                val selectedFilmsPremieres = viewModelPremieres.movies.value[position]
                val selectedFilmsIdPremieres = selectedFilmsPremieres.kinopoiskId
                bundle.putInt("filmId", selectedFilmsIdPremieres)
                findNavController().navigate(R.id.filmpageFragment, bundle)
                Log.d(
                    "HomepageFragment",
                    "HomepageFragment onItemClick   selectedFilmsIdPremieres = $selectedFilmsIdPremieres"
                )
            }

            adapterSerials.hashCode() -> if (position == 19) {
                findNavController().navigate(R.id.listpageSerialsFragment)
            } else {
                val selectedFilmsSerials = viewModelSerials.movies.value[position]
                val selectedFilmsIdSerials = selectedFilmsSerials.kinopoiskId
                bundle.putInt("filmId", selectedFilmsIdSerials)
                findNavController().navigate(R.id.filmpageFragment, bundle)
                Log.d(
                    "HomepageFragment",
                    "HomepageFragment onItemClick      selectedFilmsIdSerials = $selectedFilmsIdSerials"
                )
            }

            adapterTop250.hashCode() -> if (position == 19) {
                findNavController().navigate(R.id.listpageTop250Fragment)
            } else {
                val selectedFilmsTop250 = viewModelTop250.movies.value[position]
                val selectedFilmsIdTop250 = selectedFilmsTop250.kinopoiskId
                bundle.putInt("filmId", selectedFilmsIdTop250)
                findNavController().navigate(R.id.filmpageFragment, bundle)
                Log.d(
                    "HomepageFragment",
                    "HomepageFragment onItemClick   selectedFilmsIdTop250 = $selectedFilmsIdTop250"
                )
            }

            adapterUsMilitants.hashCode() -> if (position == 19) {
                findNavController().navigate(R.id.listpageUs_militantsFragment)
            } else {
                val selectedFilmsUsMilitants = viewModelUs_militants.movies.value[position]
                val selectedFilmsIdUsMilitants = selectedFilmsUsMilitants.kinopoiskId
                bundle.putInt("filmId", selectedFilmsIdUsMilitants)
                findNavController().navigate(R.id.filmpageFragment, bundle)
                Log.d(
                    "HomepageFragment",
                    "HomepageFragment onItemClick      selectedFilmsIdUsMilitants= $selectedFilmsIdUsMilitants"
                )
            }
        }
    }

    override fun onDestroyView() {
        Log.d("HomepageFragment", "HomepageFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}