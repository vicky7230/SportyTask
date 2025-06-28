package com.vicky7230.sportyproblem.data.repo

import com.vicky7230.sportyproblem.data.local.ApiService
import com.vicky7230.sportyproblem.data.mapper.toDomain
import com.vicky7230.sportyproblem.domain.model.Article
import com.vicky7230.sportyproblem.domain.repo.NewsRepo
import javax.inject.Inject

class NewsRepoImpl @Inject constructor(
    private val apiService: ApiService
) : NewsRepo {
    override suspend fun getNews(): List<Article> {
        return apiService.getNews().articles.map { it.toDomain() }
    }
}