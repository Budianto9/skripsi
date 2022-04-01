package com.seto.core.di

import com.seto.core.data.MainRepository
import com.seto.core.data.source.remote.datasource.RemoteMainDataSource
import com.seto.core.data.source.remote.network.ApiService
import com.seto.core.domain.repository.IMainRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


val networkModule = module {
    single {
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build()
    }
    single {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://raw.githubusercontent.com/penggguna/QuranJSON/master/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
        retrofit.create(ApiService::class.java)
    }
}

val repositoryModule = module {
    single { RemoteMainDataSource(get()) }
    single<IMainRepository> { MainRepository(get()) }
}