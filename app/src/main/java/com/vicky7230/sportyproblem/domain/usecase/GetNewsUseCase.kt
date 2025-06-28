package com.vicky7230.sportyproblem.domain.usecase

import com.vicky7230.sportyproblem.domain.model.Article
import com.vicky7230.sportyproblem.domain.repo.NewsRepo
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(
    private val newsRepo: NewsRepo
) {
    suspend operator fun invoke(): List<Article> {
        return newsRepo.getNews()
    }
}