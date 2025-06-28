package com.vicky7230.sportyproblem.data.local

import com.vicky7230.sportyproblem.data.model.NewsResponseDto


interface RemoteDataSource {
    suspend fun getNews(): NewsResponseDto
}