package com.example.skillcinema.presentation.filmpageFragment

import android.content.Intent
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
import com.example.skillcinema.databinding.FragmentFilmpageBinding
import com.example.skillcinema.presentation.filmpageFragment.description.DescriptionMovieListViewModel
import com.example.skillcinema.presentation.filmpageFragment.film_shot.ActorListAdapter
import com.example.skillcinema.presentation.filmpageFragment.film_shot.ActorListViewModel
import com.example.skillcinema.presentation.filmpageFragment.gallery.GalleryListAdapter
import com.example.skillcinema.presentation.filmpageFragment.gallery.GalleryListViewModel
import com.example.skillcinema.presentation.filmpageFragment.main_poster.MainPosterListAdapter
import com.example.skillcinema.presentation.filmpageFragment.main_poster.MainPosterListViewModel
import com.example.skillcinema.presentation.filmpageFragment.similars.SimilarsMovieListAdapter
import com.example.skillcinema.presentation.filmpageFragment.similars.SimilarsMovieListViewModel
import com.example.skillcinema.presentation.filmpageFragment.we_working_film.DirectorListAdapter
import com.example.skillcinema.presentation.filmpageFragment.we_working_film.DirectorListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class FilmpageFragment : Fragment() {
    private var _binding: FragmentFilmpageBinding? = null
    private val binding get() = _binding!!


    private val viewModelMainPoster: MainPosterListViewModel by viewModels()
    private val adapterMainPoster =
        MainPosterListAdapter { position, hash -> onItemClick(position, hash) }

    private val viewModelActor: ActorListViewModel by viewModels()
    private val adapterActor = ActorListAdapter { position, hash -> onItemClick(position, hash) }

    private val viewModelDirector: DirectorListViewModel by viewModels()
    private val adapterDirector =
        DirectorListAdapter { position, hash -> onItemClick(position, hash) }

    val viewModelGallery: GalleryListViewModel by viewModels()
    private val adapterGallery =
        GalleryListAdapter { position, hash -> onItemClick(position, hash) }

    private val viewModelSimilarsMovie: SimilarsMovieListViewModel by viewModels()
    private val adapterSimilarsMovie =
        SimilarsMovieListAdapter { position, hash -> onItemClick(position, hash) }

    private val viewModelDescription: DescriptionMovieListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFilmpageBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.posterMainRecycler.adapter = adapterMainPoster
        binding.filmShotRecycler.adapter = adapterActor
        binding.weWorkingFilmRecycler.adapter = adapterDirector
        binding.galleryRecycler.adapter = adapterGallery
        binding.similarFilmsRecycler.adapter = adapterSimilarsMovie

        val kinopoiskId = arguments?.getInt("filmId")
        Log.d("FilmpageFragment", "FilmpageFragment  filmId is bundle = $kinopoiskId")

        val id = kinopoiskId
        id.let {
            if (it != null) {
                viewModelMainPoster.loadMainPoster(it)
                viewModelDescription.loadDescription(it)
                viewModelActor.loadActor(it)
                viewModelDirector.loadDirector(it)
                viewModelGallery.loadGallery(it)
                viewModelSimilarsMovie.loadSimilars(it)

            }
        }

        fun displayONScreen() {
            viewModelMainPoster.mainPoster.onEach {
                adapterMainPoster.submitList(it)
            }.launchIn(viewLifecycleOwner.lifecycleScope)

            viewModelDescription.descriptionMovies.onEach { descriptionMovies ->
                val textDescription: String = descriptionMovies// Получаем описание фильма
                binding.textMultiLine.text = "Описание фильма: $textDescription"
            }.launchIn(viewLifecycleOwner.lifecycleScope)

            viewModelActor.actor.onEach {
                adapterActor.submitList(it)
                binding.countActor.text = it.size.toString()

            }.launchIn(viewLifecycleOwner.lifecycleScope)

            viewModelDirector.director.onEach {
                adapterDirector.submitList(it)
                binding.countDirector.text = it.size.toString()
            }.launchIn(viewLifecycleOwner.lifecycleScope)

            viewModelGallery.imageGallery.onEach {
                adapterGallery.submitList(it)
                val countGallery = it.size.toString()
                binding.countGallery.text = countGallery
            }.launchIn(viewLifecycleOwner.lifecycleScope)

            viewModelSimilarsMovie.similarsMovies.onEach {
                adapterSimilarsMovie.submitList(it)
                binding.countSimilars.text = it.size.toString()
            }.launchIn(viewLifecycleOwner.lifecycleScope)
        }
        displayONScreen()

        binding.imageView12.setOnClickListener {
            findNavController().navigate(R.id.action_filmpageFragment_to_homepageFragment)
        }

        binding.strelkaLeft4.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("gallery_frames", kinopoiskId!!)
            Log.d("FilmpageFragment", "FilmpageFragment  strelkaLeft4 = $kinopoiskId")
            val countGallery1 =  viewModelGallery.imageGallery.value.size.toString()
            Log.d("FilmpageFragment", "FilmpageFragment  countGallery1 = $countGallery1")
            bundle.putString("countGallery1", countGallery1)

            val countGallery3 =  viewModelMainPoster.mainPoster.value.size.toString()
            Log.d("FilmpageFragment", "FilmpageFragment  countGallery3 = $countGallery3")
            bundle.putString("countGallery3", countGallery3)

            findNavController().navigate(
                R.id.action_filmpageFragment_to_galleryFragmentFrames,
                bundle
            )
        }

        binding.strelkaLeft5.setOnClickListener {
            findNavController().navigate(R.id.action_filmpageFragment_to_listpageSerialsFragment)
        }

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_filmpageFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_filmpageFragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_filmpageFragment_to_profileFragment2)
        }


        binding.like.setOnClickListener {  }
        binding.bookmark.setOnClickListener {  }
        binding.preview.setOnClickListener {  }
        binding.share.setOnClickListener {
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT,"Текст сообщения")
            }
            startActivity(Intent.createChooser(sendIntent,"Поделиться через"))
        }
        binding.any.setOnClickListener {  }


    }

    private fun onItemClick(position: Int, hash: Int) {
        when (hash) {
            adapterActor.hashCode() -> {
                val bundle = Bundle()
                val actorPocter = viewModelActor.actor.value[position].posterUrl
                val actorStaffId = viewModelActor.actor.value[position].staffId
                val nameActor = viewModelActor.actor.value[position].nameRu
                val professionActor = viewModelActor.actor.value[position].professionText
                bundle.putString("actorPocter", actorPocter.toString())
                bundle.putString("actorStaffId", actorStaffId.toString())
                bundle.putString("nameActor", nameActor.toString())
                bundle.putString("professionActor", professionActor.toString())

                findNavController().navigate(
                    R.id.action_filmpageFragment_to_actorpageFragment,
                    bundle
                )
            }

            adapterDirector.hashCode() -> {
                val bundle = Bundle()
                val directorPocter = viewModelDirector.director.value[position].posterUrl
                val directorStaffId = viewModelDirector.director.value[position].staffId
                val nameDirector = viewModelDirector.director.value[position].nameRu
                val professionDirector = viewModelDirector.director.value[position].professionText
                bundle.putString("directorPocter", directorPocter.toString())
                bundle.putString("nameDirector", nameDirector.toString())
                bundle.putString("professionDirector", professionDirector.toString())
                bundle.putString("directorStaffId", directorStaffId.toString())
                findNavController().navigate(
                    R.id.action_filmpageFragment_to_directorFragment2,
                    bundle
                )
            }
        }
    }

    override fun onDestroyView() {
        Log.d("FilmpageFragment", "FilmpageFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}