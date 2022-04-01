package com.seto.core.data.source.remote.datasource

import com.seto.core.data.source.remote.network.ApiResponse
import com.seto.core.data.source.remote.network.ApiService
import com.seto.core.data.source.remote.response.SurahResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteMainDataSource(private val apiService: ApiService){

    suspend fun getAllSurah(): Flow<ApiResponse<List<SurahResponse>>>{
        return flow {
            try {
                val response = apiService.getAllSurah()
                if (response.isNotEmpty()){
                    emit(ApiResponse.Success(response))
                } else{
                    emit(ApiResponse.Empty)
                }
            } catch (ex: Exception){
                emit(ApiResponse.Error(ex.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

}
