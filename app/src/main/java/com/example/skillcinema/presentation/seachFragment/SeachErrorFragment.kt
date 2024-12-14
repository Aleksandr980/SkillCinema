package com.example.skillcinema.presentation.seachFragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentSeachErrorBinding
import com.example.skillcinema.entity.movie.Movie
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SeachErrorFragment : Fragment() {

    private var _binding: FragmentSeachErrorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeachErrorBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.filtr.setOnClickListener{
            findNavController().navigate(R.id.action_seachErrorFragment_to_seachFoundFragment)
        }
        binding.imageHome.setOnClickListener {
            findNavController().navigate(R.id.action_seachErrorFragment_to_homepageFragment)
        }
        binding.imagePoisk.setOnClickListener {
            findNavController().navigate(R.id.action_seachErrorFragment_to_seachFragment)
        }
        binding.imageContact.setOnClickListener {
            findNavController().navigate(R.id.action_seachErrorFragment_to_profileFragment2)
        }

    }
    fun onItemClick(item: Movie) {}
    override fun onDestroyView() {
        Log.d("SeachErrorFragment", "SeachErrorFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}