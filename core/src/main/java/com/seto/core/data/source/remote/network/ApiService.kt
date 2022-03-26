package com.seto.core.data.source.remote.network

import com.seto.core.data.source.remote.response.DetailSurahResponse
import com.seto.core.data.source.remote.response.SurahResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("quran.json")
    suspend fun getAllSurah() : List<SurahResponse>


    //number of surah as id
    @GET("surah/{number_of_surah}.json")
    suspend fun getDetailByNumberOfSurah(
        @Path("number_of_surah") numberOfSurah: Int
    ) : Response<DetailSurahResponse>
}