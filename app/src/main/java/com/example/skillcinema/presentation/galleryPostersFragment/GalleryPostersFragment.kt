package com.example.skillcinema.presentation.galleryPostersFragment

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
import com.example.skillcinema.databinding.FragmentGalleryPostersBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach


class GalleryPostersFragment : Fragment() {

    private var _binding: FragmentGalleryPostersBinding? = null
    private val binding get() = _binding!!


    private var countGallery1: Int = 0
    private var countGallery3: Int = 0
    private lateinit var buttonAdapter3: ButtonPostersAdapter

    private val viewModelGalleryPostersFragment: GalleryPostersFragmentViewModel by viewModels()
    private val adapterGalleryPostersFragment =
        GalleryPostersFragmentAdapter { position, hash -> onItemClick2(position, hash) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGalleryPostersBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val idPosters3 = arguments?.getInt("gallery_posters3")
        Log.d(
            "GalleryPostersFragment",
            "GalleryPostersFragment  gallery_posters3 is bundle FilmpageFragment = $idPosters3"
        )
        idPosters3.let {
            if (it != null) {
                viewModelGalleryPostersFragment.loadGalleryPostersFragment(it)
            }
        }

        arguments?.getString("countGallery1")?.let {
            countGallery1 = it.toIntOrNull() ?: 0
        }
        arguments?.getString("countGallery3")?.let {
            countGallery3 = it.toIntOrNull() ?: 0
        }
        buttonAdapter3 = ButtonPostersAdapter(countGallery1, countGallery3) { position, hash ->
            onItemClick(position, hash)
        }

        binding.choiceRecycler3.adapter = buttonAdapter3

        binding.choiceRecyclerItem3.adapter = adapterGalleryPostersFragment

        viewModelGalleryPostersFragment.imageGalleryPosterFragment.onEach {
            adapterGalleryPostersFragment.submitList(it)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.strelkaNazad.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_galleryFragmentPosters_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_galleryFragmentPosters_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_galleryFragmentPosters_to_profileFragment2)
        }
    }

    private fun onItemClick(position: Int, hash: Int) {
        when (position) {
            0 -> {
                val frames1 = arguments?.getInt("gallery_posters3")
                val bundle = Bundle()
                bundle.putInt("gallery_frames", frames1!!)
                arguments?.getString("countGallery3")?.let {
                    countGallery3 = it.toIntOrNull() ?: 0
                }
                bundle.putString("countGallery3", countGallery3.toString())
                arguments?.getString("countGallery1")?.let {
                    countGallery1 = it.toIntOrNull() ?: 0
                }
                bundle.putString("countGallery1", countGallery1.toString())
                findNavController().navigate(
                    R.id.action_galleryFragmentPosters_to_galleryFragmentFrames, bundle
                )
            }

            1 -> {
                val posters3 = arguments?.getInt("gallery_posters3")
                val bundle = Bundle()
                bundle.putInt("gallery_from_films2", posters3!!)
                arguments?.getString("countGallery3")?.let {
                    countGallery3 = it.toIntOrNull() ?: 0
                }
                bundle.putString("countGallery3", countGallery3.toString())
                arguments?.getString("countGallery1")?.let {
                    countGallery1 = it.toIntOrNull() ?: 0
                }
                bundle.putString("countGallery1", countGallery1.toString())
                findNavController().navigate(
                    R.id.action_galleryFragmentPosters_to_galleryPostersToFromFilmsFragment, bundle
                )
            }

        }
    }
    private fun onItemClick2(position: Int, hash: Int) {}
    override fun onDestroyView() {
        Log.d("GalleryPostersFragment", "GalleryPostersFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }

}