package com.seto.core.domain.repository

import com.seto.core.data.Resource
import com.seto.core.data.source.remote.response.SurahResponse
import kotlinx.coroutines.flow.Flow

interface IMainRepository {

    fun getAllSurah() : Flow<Resource<List<SurahResponse>>>
}