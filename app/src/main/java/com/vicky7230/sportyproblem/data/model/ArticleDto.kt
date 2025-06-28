package com.vicky7230.sportyproblem.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ArticleDto(
    val author: String = "",
    val content: String = "",
    val description: String = "",
    val publishedAt: String = "",
    val source: SourceDto = SourceDto.EMPTY,
    val title: String = "",
    val url: String = "",
    val urlToImage: String = ""
)