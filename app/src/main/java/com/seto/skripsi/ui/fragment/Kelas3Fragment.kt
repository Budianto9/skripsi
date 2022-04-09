package com.seto.skripsi.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.seto.core.data.Resource
import com.seto.skripsi.databinding.FragmentKelas3Binding
import com.seto.skripsi.ui.adapter.SurahAdapter
import com.seto.skripsi.ui.viewmodel.SurahViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber

class Kelas3Fragment : Fragment() {

    private var _binding: FragmentKelas3Binding? = null
    private val viewModel: SurahViewModel by viewModel()
    private lateinit var surahAdapter: SurahAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentKelas3Binding.inflate(inflater, container, false)
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
                        surahAdapter.setData(surah.data?.slice(20..29))
                        Timber.e("Panjang list nya : ${surah.data?.size}")
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