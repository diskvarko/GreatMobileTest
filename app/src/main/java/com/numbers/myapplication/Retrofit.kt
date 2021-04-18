package com.numbers.myapplication

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.numbers.myapplication.Constants.Companion.BASE_URL
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {

    @ExperimentalSerializationApi
    private val retrofitBuilder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @ExperimentalSerializationApi
    val newsApi: NewsApi = retrofitBuilder.create(NewsApi::class.java)
}