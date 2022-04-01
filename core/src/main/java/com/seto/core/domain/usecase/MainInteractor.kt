package com.seto.core.domain.usecase

import com.seto.core.data.Resource
import com.seto.core.data.source.remote.response.SurahResponse
import com.seto.core.domain.repository.IMainRepository
import kotlinx.coroutines.flow.Flow

class MainInteractor(private val repository: IMainRepository): MainUseCase {
    override fun getAllSurah(): Flow<Resource<List<SurahResponse>>> =
        repository.getAllSurah()
}