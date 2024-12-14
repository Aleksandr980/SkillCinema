package com.example.skillcinema.presentation.galleryFromFilms

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
import com.example.skillcinema.databinding.FragmentGalleryFromFilmsBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class GalleryPostersToFromFilmsFragment : Fragment() {


    private var _binding: FragmentGalleryFromFilmsBinding? = null
    private val binding get() = _binding!!

    private var countGallery1: Int = 0
    private var countGallery3: Int = 0
    private lateinit var buttonAdapter2_2: ButtonPostersToFromFilmsAdapter

    private val viewModelGalleryPostersToFromFilmsFragment: GalleryPostersToFromFilmsFragmentViewModel by viewModels()
    private val adapterGalleryPostersToFromFilmsFragment =
        GalleryPostersToFromFilmsFragmentAdapter { position, hash -> onItemClick4(position, hash) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGalleryFromFilmsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fromFilms2 = arguments?.getInt("gallery_from_films2")
        Log.d(
            "GalleryPostersToFromFilmsFragment",
            "GalleryPostersToFromFilmsFragment  gallery_from_films2 is bundle filmpageFragment = $fromFilms2"
        )
        fromFilms2.let {
            if (it != null) {
                viewModelGalleryPostersToFromFilmsFragment.loadGalleryPostersToFromFilmsFragment(it)
            }
        }
        arguments?.getString("countGallery1")?.let {
            countGallery1 = it.toIntOrNull() ?: 0
        }
        arguments?.getString("countGallery3")?.let {
            countGallery3 = it.toIntOrNull() ?: 0
        }
        buttonAdapter2_2 = ButtonPostersToFromFilmsAdapter(countGallery1, countGallery3) { position, hash ->
                onItemClick3(position, hash)
            }

        binding.choiceRecycler2.adapter = buttonAdapter2_2



        binding.choiceRecyclerItem.adapter = adapterGalleryPostersToFromFilmsFragment

        viewModelGalleryPostersToFromFilmsFragment.imageGalleryPosterFragment.onEach {
            adapterGalleryPostersToFromFilmsFragment.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.strelkaNazad.setOnClickListener {}

        binding.exit.setOnClickListener { findNavController().popBackStack() }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_galleryPostersToFromFilmsFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_galleryPostersToFromFilmsFragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_galleryPostersToFromFilmsFragment_to_profileFragment2)
        }
    }
    private fun onItemClick3(position: Int, hash: Int) {}
    private fun onItemClick4(position: Int, hash: Int) {}

    override fun onDestroyView() {
        Log.d("GalleryPostersToFromFilmsFragment", "GalleryPostersToFromFilmsFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }

}