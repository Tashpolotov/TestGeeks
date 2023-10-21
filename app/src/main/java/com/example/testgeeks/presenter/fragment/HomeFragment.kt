package com.example.testgeeks.presenter.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.testgeeks.R
import com.example.testgeeks.databinding.FragmentHomeBinding
import com.example.testgeeks.presenter.adapter.HomeAdapter
import com.example.testgeeks.presenter.viewmodel.SportViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding
    private val viewModel by viewModels<SportViewModel>()
    private val adapter = HomeAdapter(this::onClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,  container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        binding.rv.adapter = adapter

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.sport.collect{
                adapter.submitList(it.home)
            }
        }
        viewModel.loadHome()
    }

    private fun onClick() {
        findNavController().navigate(R.id.action_homeFragment_to_detailsFragment)
    }
}