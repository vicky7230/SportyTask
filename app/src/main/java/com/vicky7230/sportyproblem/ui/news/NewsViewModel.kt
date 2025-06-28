package com.vicky7230.sportyproblem.ui.news

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vicky7230.sportyproblem.domain.usecase.GetNewsUseCase
import kotlinx.collections.immutable.toPersistentList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class NewsViewModel @Inject constructor(
    private val getNewsUseCase: GetNewsUseCase
) : ViewModel() {

    private val _newsUiState: MutableStateFlow<NewsUiState> = MutableStateFlow(NewsUiState.Idle)
    val newsUiState: StateFlow<NewsUiState> = _newsUiState.asStateFlow()

    init {
        getNews()
    }

    fun getNews() {
        viewModelScope.launch {
            try {
                _newsUiState.value = NewsUiState.Loading
                val news = getNewsUseCase()
                _newsUiState.value = NewsUiState.ArticlesLoaded(news.toPersistentList())
            } catch (ex: Exception) {
                Timber.e(ex, "Error fetching news")
                _newsUiState.value = NewsUiState.Error(ex.message ?: "Unknown error")
            }
        }
    }
}