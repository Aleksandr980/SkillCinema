package com.example.skillcinema.presentation.seachFragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentSearchCountryBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SearchCountryFragment : Fragment() {
    private var _binding: FragmentSearchCountryBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchCountryBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        binding.strelkaNazad.setOnClickListener { findNavController().popBackStack() }

        fun setCountryClickListener(button: TextView, country: String) {
            button.setOnClickListener {
                bundle.putString("country", country)
                findNavController().navigate(
                    R.id.action_searchCountryFragment_to_seachFoundFragment,
                    bundle
                )
            }
        }

        setCountryClickListener(binding.country1, "Россия")
        setCountryClickListener(binding.country2, "Великобритания")
        setCountryClickListener(binding.country3, "Германия")
        setCountryClickListener(binding.country4, "США")
        setCountryClickListener(binding.country5, "Франция")

        binding.searchIcon.setOnClickListener {
            val country = binding.searchEditText.text.toString()
            bundle.putString("country", country)
            findNavController().navigate(
                R.id.action_searchCountryFragment_to_seachFoundFragment,
                bundle
            )
        }

    }

}