package com.example.skillcinema.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentLoaderBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LoaderFragment : Fragment() {
    private var _binding: FragmentLoaderBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentLoaderBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageView.setOnClickListener {
            findNavController().navigate(R.id.action_loaderFragment_to_homepageFragment)
        }
    }
    companion object {
        @JvmStatic
        fun newInstanceLoader() = LoaderFragment()
    }

}