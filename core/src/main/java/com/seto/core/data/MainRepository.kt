package com.seto.core.data

import com.seto.core.data.source.remote.datasource.RemoteSurahDataSource
import com.seto.core.data.source.remote.network.ApiResponse
import com.seto.core.data.source.remote.response.SurahResponse
import com.seto.core.domain.repository.IMainRepository
import kotlinx.coroutines.flow.Flow

class MainRepository(
    private val remoteSurahDataSource: RemoteSurahDataSource
) : IMainRepository {
    override fun getAllSurah(): Flow<Resource<List<SurahResponse>>> =
        object : OnlyNetworkBoundResource<List<SurahResponse>>(){
            override suspend fun createCall(): Flow<ApiResponse<List<SurahResponse>>> =
                remoteSurahDataSource.getAllSurah()

        }.asFlow()
}