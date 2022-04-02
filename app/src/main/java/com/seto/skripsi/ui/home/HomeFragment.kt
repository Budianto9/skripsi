package com.seto.skripsi.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.seto.core.data.Resource
import com.seto.skripsi.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val viewModel: HomeViewModel by viewModel()
    private lateinit var homeAdapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUi()
        initObserve()
    }

    private fun initUi(){
        homeAdapter = HomeAdapter()
        val linearLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvSurah.layoutManager = linearLayoutManager
        binding.rvSurah.setHasFixedSize(true)
        binding.rvSurah.adapter = homeAdapter
    }

    private fun initObserve(){
        viewModel.surah.observe(viewLifecycleOwner) { surah ->
            if (surah != null){
                when(surah){
                    is Resource.Loading ->{
                        binding.progressBar.visibility = View.VISIBLE
                    }
                    is Resource.Success ->{
                        binding.progressBar.visibility = View.GONE
                        homeAdapter.setData(surah.data)
                    }
                    is Resource.Error ->{
                        binding.tvError.visibility = View.VISIBLE
                    } else -> null
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}