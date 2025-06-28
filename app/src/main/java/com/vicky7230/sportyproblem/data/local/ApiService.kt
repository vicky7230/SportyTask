package com.vicky7230.sportyproblem.data.local

import com.vicky7230.sportyproblem.BuildConfig
import com.vicky7230.sportyproblem.data.model.NewsResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v2/top-headlines")
    suspend fun getNews(
        @Query("country") country: String = "us",
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): NewsResponseDto
}