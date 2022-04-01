package com.seto.skripsi.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.seto.core.domain.usecase.MainUseCase

class HomeViewModel(private val mainUseCase: MainUseCase) : ViewModel() {
    val surah = mainUseCase.getAllSurah().asLiveData()
}