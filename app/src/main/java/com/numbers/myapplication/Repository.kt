package com.numbers.myapplication

import retrofit2.Response

class Repository {

    suspend fun getNews(): List<Post> {
        return Retrofit.newsApi.getNews()
    }
}