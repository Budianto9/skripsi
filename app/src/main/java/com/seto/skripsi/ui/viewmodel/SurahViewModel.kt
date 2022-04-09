package com.seto.skripsi.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.seto.core.domain.usecase.MainUseCase

class SurahViewModel(private val mainUseCase: MainUseCase) : ViewModel() {
    val surah = mainUseCase.getAllSurah().asLiveData()
}