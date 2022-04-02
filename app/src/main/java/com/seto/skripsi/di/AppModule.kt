package com.seto.skripsi.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.seto.core.domain.usecase.MainInteractor
import com.seto.core.domain.usecase.MainUseCase
import com.seto.skripsi.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val useCaseModule = module {
    factory<MainUseCase> { MainInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}