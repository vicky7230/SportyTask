package com.vicky7230.sportyproblem.data.mapper

import com.vicky7230.sportyproblem.data.model.ArticleDto
import com.vicky7230.sportyproblem.domain.model.Article

fun ArticleDto.toDomain() : Article {
    return Article(
        title = title,
        description = description,
        content = content,
        urlToImage = urlToImage,
        url = url,
        publishedAt = publishedAt,
        source = source.name
    )
}