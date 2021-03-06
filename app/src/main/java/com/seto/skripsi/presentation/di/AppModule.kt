package com.seto.skripsi.presentation.di

import com.seto.core.domain.usecase.MainInteractor
import com.seto.core.domain.usecase.MainUseCase
import com.seto.skripsi.presentation.ui.viewmodel.SurahViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val useCaseModule = module {
    factory<MainUseCase> { MainInteractor(get()) }
}

val viewModelModule = module {
    viewModel { SurahViewModel(get()) }
}