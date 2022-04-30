package com.seto.skripsi.presentation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.seto.core.data.Resource
import com.seto.skripsi.databinding.FragmentKelas4Binding
import com.seto.skripsi.presentation.ui.adapter.SurahAdapter
import com.seto.skripsi.presentation.ui.viewmodel.SurahViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class Kelas4Fragment : Fragment() {

    private var _binding: FragmentKelas4Binding? = null
    private val viewModel: SurahViewModel by viewModel()
    private lateinit var surahAdapter: SurahAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKelas4Binding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUi()
        initObserve()
    }


    private fun initUi(){
        surahAdapter = SurahAdapter()
        val linearLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvSurah.layoutManager = linearLayoutManager
        binding.rvSurah.setHasFixedSize(true)
        binding.rvSurah.adapter = surahAdapter
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
                        surahAdapter.setData(surah.data?.slice(30..39))
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