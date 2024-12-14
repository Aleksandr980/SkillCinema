package com.example.skillcinema.presentation.seachFragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.skillcinema.R
import com.example.skillcinema.databinding.FragmentSearchYearBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SearchYearFragment : Fragment() {
    private var _binding: FragmentSearchYearBinding? = null
    private val binding get() = _binding!!

    private var yearList1: ArrayList<Int>? = null
    private var yearList2: ArrayList<Int>? = null
    fun yearArray1(): ArrayList<Int>?{
        yearList1 = ArrayList()
        for (year in 1977..2024) {
            yearList1?.add(year)
        }
        return yearList1
    }
    fun yearArray2(): ArrayList<Int>?{
        yearList2 = ArrayList()
        for (year in 1977..2024) {
            yearList2?.add(year)
        }
       return yearList2
    }
    private var yearAdapter1 = YearAdapter(yearArray1()!!) { year -> onClick1(year) }
    private val startYear1 = 1977
    private val endYear1 = 2024
    private val itemsPerPage1 = 12
    private var currentPage1 = 0

    private var yearAdapter2 = YearAdapter(yearArray2()!!) { year -> onClick2(year) }
    private val startYear2 = 1977
    private val endYear2 = 2024
    private val itemsPerPage2 = 12
    private var currentPage2 = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchYearBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        binding.recyclerView1.adapter = yearAdapter1
        binding.recyclerView2.adapter = yearAdapter2

        binding.forward1.setOnClickListener {
            if ((currentPage1 + 1) * itemsPerPage1 < (endYear1 - startYear1 + 1)) {
                currentPage1++
                loadYears1()
                yearAdapter1?.notifyDataSetChanged()
            }
        }
        binding.back1.setOnClickListener {
            if (currentPage1 > 0) {
                currentPage1--
                loadYears1()
                yearAdapter1?.notifyDataSetChanged()
            }
        }

        binding.forward2.setOnClickListener {
            if ((currentPage2 + 1) * itemsPerPage2 < (endYear2 - startYear2 + 1)) {
                currentPage2++
                loadYears2()
                yearAdapter2?.notifyDataSetChanged()
            }
        }
        binding.back2.setOnClickListener {
            if (currentPage2 > 0) {
                currentPage2--
                loadYears2()
                yearAdapter2?.notifyDataSetChanged()
            }
        }
        binding.strelkaNazad.setOnClickListener { findNavController().popBackStack() }

        binding.choice.setOnClickListener {
            onClickChoice()
        }

    }
    private var selectedYear1: Int? = null
    private var selectedYear2: Int? = null

    private fun onClick1(year: Int) {
        selectedYear1 = year
        Log.d("SearchYearFragment", "SearchYearFragment selectedYear1 = $selectedYear1")
    }
    private fun onClick2(year: Int) {
        selectedYear2 = year
        Log.d("SearchYearFragment", "SearchYearFragment selectedYear2 = $selectedYear2")
    }

    private fun onClickChoice() {
        val bundle = Bundle()
        bundle.putInt("periodBefore", selectedYear1!!)
        bundle.putInt("periodAfter", selectedYear2!!)
        findNavController().navigate(R.id.action_searchYearFragment_to_seachFoundFragment, bundle)
    }

    fun loadYears1() {
        yearList1!!.clear()
        val start = startYear1 + (currentPage1 * itemsPerPage1)
        for (i in start until start + itemsPerPage1) {
            if (i <= endYear1) {
                yearList1!!.add(i)
            }
        }
    }
    fun loadYears2() {
        yearList2!!.clear()
        val start = startYear2 + (currentPage2 * itemsPerPage2)
        for (i in start until start + itemsPerPage2) {
            if (i <= endYear2) {
                yearList2!!.add(i)
            }
        }
    }
    override fun onDestroyView() {
        Log.d("SearchYearFragment", "SearchYearFragment DestroyView")
        super.onDestroyView()
        _binding = null
    }
}