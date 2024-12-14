package com.example.skillcinema.presentation.actorpage_directorpage_Fragment.director

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentDirectorBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class DirectorFragment : Fragment() {

    private var _binding: FragmentDirectorBinding? = null
    private val  binding get() = _binding!!

    private val topMovieByDirectorViewModel: TopMovieByDirectorViewModel by viewModels()
    private val topMovieByDirectorAdaptor = TopMovieByDirectorAdaptor { position, hash -> onItemClick(position, hash) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDirectorBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.listFilmRecyclerDir.adapter = topMovieByDirectorAdaptor

        val arguments = arguments
        val directorStaffId = arguments?.getString("directorStaffId")
        val directorPocter = arguments?.getString("directorPocter")
        Log.d("DirectorFragment", "DirectorFragment directorPocter = $directorPocter")
        val nameDirector = arguments?.getString("nameDirector")
        Log.d("DirectorFragment", "DirectorFragment nameDirector = $nameDirector")
        val professionDirector = arguments?.getString("professionDirector")
        Log.d("DirectorFragment","DirectorFragment professionDirector = $professionDirector")

        val staffId = directorStaffId?.toInt()
        staffId.let {
            Log.d("DirectorFragment","DirectorFragment staffId = $staffId")
            if (it != null) {
                topMovieByDirectorViewModel.loadTopMovieByDirector(staffId!!)

            }
        }

        val nameD = nameDirector
        val professionD = professionDirector
        val dPocter = directorPocter
        binding.nameDir.text = nameD
        binding.professionDir.text = professionD
        Glide
            .with(binding.posterDir.context)
            .load(dPocter)
            .into(binding.posterDir)

        binding.imageBackDir.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.listFilmRecyclerDir.setOnClickListener {
            findNavController().navigate(R.id.filmpageFragment)
        }
        topMovieByDirectorViewModel.filmDir.onEach {
            Log.d(
                "DirectorFragment",
                "DirectorFragment topMovieByDirectorViewModel.filmDir.onEach == $it"
            )
            Log.d(
                "DirectorFragment",
                "DirectorFragment topMovieByDirectorViewModel.filmDir.size == ${it.size.toString()}"
            )
            binding.countFilmDir.text = it.size.toString()
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_directorFragment2_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_directorFragment2_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_directorFragment2_to_profileFragment2)
        }

    }


    private fun onItemClick(position: Int, hash: Int){}
    override fun onDestroyView() {
        Log.d("DirectorFragment", "DirectorFragment DestroyView")
        super.onDestroyView()
        _binding = null

    }

}