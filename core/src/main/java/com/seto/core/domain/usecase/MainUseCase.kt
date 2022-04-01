package com.seto.core.domain.usecase

import com.seto.core.data.Resource
import com.seto.core.data.source.remote.response.SurahResponse
import kotlinx.coroutines.flow.Flow

interface MainUseCase {

    fun getAllSurah() : Flow<Resource<List<SurahResponse>>>
}