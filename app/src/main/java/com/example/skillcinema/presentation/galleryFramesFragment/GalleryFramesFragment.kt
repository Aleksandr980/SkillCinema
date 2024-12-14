package com.example.skillcinema.presentation.galleryFramesFragment

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
import com.example.skillcinema.databinding.FragmentGalleryFramesBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach


class GalleryFramesFragment : Fragment() {


    private var _binding: FragmentGalleryFramesBinding? = null
    private val binding get() = _binding!!

private var countGallery1: Int = 0
    private var countGallery3: Int = 0
    private lateinit var buttonAdapter: ButtonFramesAdapter

    private val viewModelGalleryFramesFragment: GalleryFramesFragmentViewModel by viewModels()
    private val adapterGalleryFramesFragment =
        GalleryFramesFragmentAdapter { position, hash -> onItemClick2(position, hash) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGalleryFramesBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val frames1 = arguments?.getInt("gallery_frames")
        Log.d(
            "GalleryFramesFragment",
            "GalleryFramesFragment  gallery_frames is bundle filmpageFragment = $frames1"
        )
        frames1.let {
            if (it != null) {
                viewModelGalleryFramesFragment.loadGalleryFramesFragment(it)
            }
        }
        arguments?.getString("countGallery1")?.let {
            countGallery1 = it.toIntOrNull() ?: 0
        }
        arguments?.getString("countGallery3")?.let {
            countGallery3 = it.toIntOrNull() ?: 0
        }
        buttonAdapter = ButtonFramesAdapter(countGallery1, countGallery3) { position, hash ->
            onItemClick(position, hash)
        }

        binding.choiceRecycler.adapter = buttonAdapter

        binding.choiceRecyclerItem.adapter = adapterGalleryFramesFragment

        viewModelGalleryFramesFragment.imageGalleryFragment.onEach {
            adapterGalleryFramesFragment.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.strelkaNazad.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_galleryFragmentFrames_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_galleryFragmentFrames_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_galleryFragmentFrames_to_profileFragment2)
        }
    }

    private fun onItemClick(position: Int, hash: Int) {
        when (position) {
            1 -> {
                val fromFilms2 = arguments?.getInt("gallery_frames")
                val bundle = Bundle()
                bundle.putInt("gallery_from_films2", fromFilms2!!)
                arguments?.getString("countGallery3")?.let {
                    countGallery3 = it.toIntOrNull() ?: 0
                }
                bundle.putString("countGallery3", countGallery3.toString())
                arguments?.getString("countGallery1")?.let {
                    countGallery1 = it.toIntOrNull() ?: 0
                }
                bundle.putString("countGallery1", countGallery1.toString())
                findNavController().navigate(
                    R.id.action_galleryFragmentFrames_to_galleryFromFilmsFragment, bundle
                )
            }

            2 -> {
                val posters3 = arguments?.getInt("gallery_frames")
                val bundle = Bundle()
                bundle.putInt("gallery_posters3", posters3!!)

                arguments?.getString("countGallery3")?.let {
                    countGallery3 = it.toIntOrNull() ?: 0
                }
                bundle.putString("countGallery3", countGallery3.toString())
                arguments?.getString("countGallery1")?.let {
                    countGallery1 = it.toIntOrNull() ?: 0
                }
                bundle.putString("countGallery1", countGallery1.toString())

                findNavController().navigate(
                    R.id.action_galleryFragmentFrames_to_galleryFragmentPosters, bundle
                )
            }

        }
    }
    private fun onItemClick2(position: Int, hash: Int) {}
    override fun onDestroyView() {
        Log.d("GalleryFramesFragment", "GalleryFramesFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }

}