package com.seto.core.data

import com.seto.core.data.source.remote.datasource.RemoteMainDataSource
import com.seto.core.data.source.remote.network.ApiResponse
import com.seto.core.data.source.remote.response.SurahResponse
import com.seto.core.domain.repository.IMainRepository
import kotlinx.coroutines.flow.Flow

class MainRepository(
    private val remoteMainDataSource: RemoteMainDataSource
) : IMainRepository {
    override fun getAllSurah(): Flow<Resource<List<SurahResponse>>> =
        object : OnlyNetworkBoundResource<List<SurahResponse>>(){
            override suspend fun createCall(): Flow<ApiResponse<List<SurahResponse>>> =
                remoteMainDataSource.getAllSurah()

        }.asFlow()
}