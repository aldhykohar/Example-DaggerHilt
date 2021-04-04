package com.aldhykohar.exampledaggerhilt.di

import com.aldhykohar.exampledaggerhilt.network.PostApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


/**
 * Created by aldhykohar on 4/4/2021.
 */

@Module
@InstallIn(ApplicationComponent::class)
class AppModule {

    @Provides
    fun providesBaseUrl(): String = "https://jsonplaceholder.typicode.com/"

    @Provides
    @Singleton
    fun providesRetrofitBuilder(baseUrl: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun providesPostApiServices(retrofit: Retrofit):PostApiService=
        retrofit.create(PostApiService::class.java)
}