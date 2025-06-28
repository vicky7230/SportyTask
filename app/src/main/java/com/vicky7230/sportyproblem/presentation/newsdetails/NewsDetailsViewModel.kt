package com.vicky7230.sportyproblem.presentation.newsdetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import com.vicky7230.sportyproblem.di.AssistedViewModelFactory
import com.vicky7230.sportyproblem.navigation.NewsDetailsScreen
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.MutableStateFlow

class NewsDetailsViewModel @AssistedInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
    @AssistedFactory
    interface Factory : AssistedViewModelFactory<NewsDetailsViewModel> {
        override fun create(savedStateHandle: SavedStateHandle): NewsDetailsViewModel
    }

    private val _newsDetailsUiState: MutableStateFlow<NewsDetailsUiState> = MutableStateFlow(NewsDetailsUiState.Idle)
    val newsDetailsUiState: MutableStateFlow<NewsDetailsUiState> = _newsDetailsUiState

    init {
        val newsDetailsScreen = savedStateHandle.toRoute<NewsDetailsScreen>()
        _newsDetailsUiState.value = NewsDetailsUiState.ArticleLoaded(
            ArticleDetails(
                title = newsDetailsScreen.title,
                description = newsDetailsScreen.description,
                urlToImage = newsDetailsScreen.urlToImage,
                content = newsDetailsScreen.content,
                url = newsDetailsScreen.url
            )
        )
    }
}