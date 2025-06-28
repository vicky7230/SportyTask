package com.vicky7230.sportyproblem.data.model

import kotlinx.serialization.Serializable

@Serializable
data class NewsResponseDto(
    val articles: List<ArticleDto> = emptyList(),
    val status: String = "",
    val totalResults: Int = 0
)