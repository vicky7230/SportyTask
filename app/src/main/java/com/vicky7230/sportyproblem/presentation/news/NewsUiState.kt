package com.vicky7230.sportyproblem.presentation.news

import com.vicky7230.sportyproblem.domain.model.Article
import kotlinx.collections.immutable.PersistentList

sealed class NewsUiState {
    data object Idle : NewsUiState()
    data object Loading : NewsUiState()
    data class ArticlesLoaded(val articles: PersistentList<Article>) : NewsUiState()
    data class Error(val message: String) : NewsUiState()
}