package com.vicky7230.sportyproblem.data.local

import com.vicky7230.sportyproblem.data.model.NewsResponseDto
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : RemoteDataSource {
    override suspend fun getNews(): NewsResponseDto {
        return apiService.getNews()
    }
}