package com.numbers.myapplication

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface NewsApi {
    @GET("api/news")
    suspend fun getNews(): List<Post>

    @POST("api/news")
    suspend fun sendPost(
        @Body post: Post
    ): List<Post>

    suspend fun postNews(): Response<Post>
}