package com.vicky7230.sportyproblem.domain.repo

import com.vicky7230.sportyproblem.domain.model.Article


interface NewsRepo {
    suspend fun getNews(): List<Article>
}