package com.vicky7230.sportyproblem.ui.newsdetails

sealed class NewsDetailsUiState {
    data object Idle : NewsDetailsUiState()
    data class ArticleLoaded(
        val articleDetails: ArticleDetails
    ) : NewsDetailsUiState()
}

data class ArticleDetails(
    val title: String,
    val description: String,
    val content: String,
    val urlToImage: String
)
