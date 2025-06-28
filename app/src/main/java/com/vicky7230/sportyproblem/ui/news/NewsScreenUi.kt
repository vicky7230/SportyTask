package com.vicky7230.sportyproblem.ui.news

import android.content.res.Configuration
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.vicky7230.sportyproblem.domain.model.Article
import com.vicky7230.sportyproblem.ui.common.ErrorScreen
import com.vicky7230.sportyproblem.ui.common.LoadingScreen
import com.vicky7230.sportyproblem.ui.news.composables.NewsContent
import com.vicky7230.sportyproblem.ui.theme.SportyProblemTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsScreenUi(
    modifier: Modifier = Modifier,
    newsUiState: NewsUiState,
    onNewsArticleClick: (Article) -> Unit,
    onRetryClick: () -> Unit
) {
    val state = newsUiState
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = "Headlines") }
            )
        }
    ) { padding: PaddingValues ->
        when (state) {
            is NewsUiState.Error -> {
                ErrorScreen(
                    message = state.message,
                    modifier =
                        Modifier
                            .fillMaxSize()
                            .padding(padding),
                    onRetryClick = onRetryClick
                )
            }

            NewsUiState.Idle -> Unit
            NewsUiState.Loading -> {
                LoadingScreen(
                    modifier =
                        Modifier
                            .fillMaxSize()
                            .padding(padding)
                )
            }

            is NewsUiState.ArticlesLoaded -> {
                NewsContent(
                    modifier =
                        Modifier
                            .fillMaxSize()
                            .padding(padding),
                    articles = state.articles,
                    onNewsArticleClick = onNewsArticleClick
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun NewsScreenPreviewLight(
    @PreviewParameter(NewsScreenPreviewParameterProvider::class) newsUiState: NewsUiState,
) {
    SportyProblemTheme(darkTheme = false) {
        NewsScreenUi(
            modifier = Modifier.fillMaxSize(),
            newsUiState = newsUiState,
            onNewsArticleClick = {},
            onRetryClick = {}
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun NewsScreenPreviewDark(
    @PreviewParameter(NewsScreenPreviewParameterProvider::class) newsUiState: NewsUiState,
) {
    SportyProblemTheme(darkTheme = true) {
        NewsScreenUi(
            modifier = Modifier.fillMaxSize(),
            newsUiState = newsUiState,
            onNewsArticleClick = {},
            onRetryClick = {}
        )
    }
}