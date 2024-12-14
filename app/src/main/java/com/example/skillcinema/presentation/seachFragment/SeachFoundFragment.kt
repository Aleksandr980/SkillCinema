package com.example.skillcinema.presentation.seachFragment

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentSeachFoundBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SeachFoundFragment : Fragment() {
    private var _binding: FragmentSeachFoundBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeachFoundBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rangeSeekBar = binding.rskFreq
        val textViewMin = binding.rangeStart
        val textViewMax = binding.rangeFinish

        rangeSeekBar.setOnRangeSeekBarChangeListener { bar, minValue, maxValue ->

            when (rangeSeekBar.selectedMinValue) {
                minValue -> textViewMin.text = "${minValue}"
            }
            when (rangeSeekBar.selectedMaxValue) {
                maxValue -> textViewMax.text = "${maxValue}"

            }
            Log.d("SeachFoundFragment", "SeachFoundFragment     min = ${minValue}")
            Log.d("SeachFoundFragment", "SeachFoundFragment     max = $maxValue")

        }

        binding.strelkaNazad.setOnClickListener {
            //findNavController().popBackStack()
            findNavController().navigate(R.id.action_seachFoundFragment_to_seachFragment)
        }

        val bottonVse = binding.vseBn
        val bottonFilms = binding.filmsBn
        val bottonSeries = binding.serialsBn

        bottonVse.setOnClickListener {
            when (bottonVse.isPressed) {
                true -> {
                    bottonVse.setBackgroundResource(R.drawable.vse_indigo)
                    bottonVse.setTextColor(Color.WHITE)
                    bottonFilms.setBackgroundResource(R.drawable.films_white)
                    bottonFilms.setTextColor(Color.BLACK)
                    bottonSeries.setBackgroundResource(R.drawable.serials_white)
                    bottonSeries.setTextColor(Color.BLACK)
                }

                false -> {}
            }
        }

        bottonFilms.setOnClickListener {
            when (bottonFilms.isPressed) {
                true -> {
                    bottonVse.setBackgroundResource(R.drawable.vse_white)
                    bottonVse.setTextColor(Color.BLACK)
                    bottonFilms.setBackgroundResource(R.drawable.films_indigo)
                    bottonFilms.setTextColor(Color.WHITE)
                    bottonSeries.setBackgroundResource(R.drawable.serials_white)
                    bottonSeries.setTextColor(Color.BLACK)
                }

                false -> {}
            }
        }

        bottonSeries.setOnClickListener {
            when (bottonSeries.isPressed) {
                true -> {
                    bottonVse.setBackgroundResource(R.drawable.vse_white)
                    bottonVse.setTextColor(Color.BLACK)
                    bottonFilms.setBackgroundResource(R.drawable.films_white)
                    bottonFilms.setTextColor(Color.BLACK)
                    bottonSeries.setBackgroundResource(R.drawable.serials_indigo)
                    bottonSeries.setTextColor(Color.WHITE)
                }

                false -> {}
            }
        }

        binding.linearlayoutCountry.setOnClickListener { findNavController().navigate(R.id.action_seachFoundFragment_to_searchCountryFragment) }
        binding.linearlayoutGenre.setOnClickListener { findNavController().navigate(R.id.action_seachFoundFragment_to_searchGenreFragment) }
        binding.linearlayoutYear.setOnClickListener { findNavController().navigate(R.id.action_seachFoundFragment_to_searchYearFragment) }


        val bottonData = binding.dateBn
        val bottonPopular = binding.popularBn
        val bottonRating = binding.ratingBn

        bottonData.setOnClickListener {
            when (bottonData.isPressed) {
                true -> {
                    bottonData.setBackgroundResource(R.drawable.vse_indigo)
                    bottonData.setTextColor(Color.WHITE)
                    bottonPopular.setBackgroundResource(R.drawable.films_white)
                    bottonPopular.setTextColor(Color.BLACK)
                    bottonRating.setBackgroundResource(R.drawable.serials_white)
                    bottonRating.setTextColor(Color.BLACK)
                }

                false -> {}
            }
        }

        bottonPopular.setOnClickListener {
            when (bottonPopular.isPressed) {
                true -> {
                    bottonData.setBackgroundResource(R.drawable.vse_white)
                    bottonData.setTextColor(Color.BLACK)
                    bottonPopular.setBackgroundResource(R.drawable.films_indigo)
                    bottonPopular.setTextColor(Color.WHITE)
                    bottonRating.setBackgroundResource(R.drawable.serials_white)
                    bottonRating.setTextColor(Color.BLACK)
                }

                false -> {}
            }
        }

        bottonRating.setOnClickListener {
            when (bottonRating.isPressed) {
                true -> {
                    bottonData.setBackgroundResource(R.drawable.vse_white)
                    bottonData.setTextColor(Color.BLACK)
                    bottonPopular.setBackgroundResource(R.drawable.films_white)
                    bottonPopular.setTextColor(Color.BLACK)
                    bottonRating.setBackgroundResource(R.drawable.serials_indigo)
                    bottonRating.setTextColor(Color.WHITE)
                }

                false -> {}
            }
        }

        var isViewed = false
        binding.preview.setOnClickListener {
            isViewed = !isViewed
            if (isViewed) {
                binding.preview.text = "Просмотрен"
                binding.previewIcon.setBackgroundResource(R.drawable.glaz)
            } else {
                binding.preview.text = "Не просмотрен"
                binding.previewIcon.setBackgroundResource(R.drawable.preview)
            }
        }

        val selectedCountry = arguments?.getString("country")
        if (selectedCountry!= null) {
            binding.countryItem.text = selectedCountry
        }
        val selectedGenre = arguments?.getString("genre")
        if (selectedGenre!= null) {
            binding.genreItem.text = selectedGenre
        }


        val before = arguments?.getInt("periodBefore")
        Log.d("SeachFoundFragment", "SearchYearFragment before = $before")
        binding.yearItem2.text = "$before"

        val after = arguments?.getInt("periodAfter")
        Log.d("SeachFoundFragment", "SearchYearFragment after = $after")
        binding.yearItem4.text = "$after"

    }

    override fun onDestroyView() {
        Log.d("SeachFoundFragment", "SeachFoundFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }





}
