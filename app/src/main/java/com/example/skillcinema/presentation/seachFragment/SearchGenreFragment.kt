package com.example.skillcinema.presentation.seachFragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentSearchGenreBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchGenreFragment : Fragment() {
    private var _binding: FragmentSearchGenreBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchGenreBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()
        binding.strelkaNazad.setOnClickListener { findNavController().popBackStack() }

        fun setGenreClickListener(button: TextView, genre: String) {
            button.setOnClickListener {
                bundle.putString("genre", genre)
                findNavController().navigate(
                    R.id.action_searchGenreFragment_to_seachFoundFragment,
                    bundle
                )
            }
        }

        setGenreClickListener(binding.genre1, "Комедия")
        setGenreClickListener(binding.genre2, "Мелодрама")
        setGenreClickListener(binding.genre3, "Боевик")
        setGenreClickListener(binding.genre4, "Вестерн")
        setGenreClickListener(binding.genre5, "Драма")

        binding.searchIcon.setOnClickListener {
            val genre = binding.searchEditText.text.toString()
            bundle.putString("genre", genre)
            findNavController().navigate(
                R.id.action_searchGenreFragment_to_seachFoundFragment,
                bundle
            )
        }
    }

    override fun onDestroyView() {
        Log.d("SearchGenreFragment", "SearchGenreFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }

}