package com.vicky7230.sportyproblem.presentation.news

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.vicky7230.sportyproblem.domain.model.Article
import com.vicky7230.sportyproblem.presentation.common.ErrorScreen
import com.vicky7230.sportyproblem.presentation.common.LoadingScreen
import com.vicky7230.sportyproblem.presentation.news.composables.NewsContent
import com.vicky7230.sportyproblem.presentation.theme.SportyProblemTheme

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
        containerColor = MaterialTheme.colorScheme.background,
        contentColor = MaterialTheme.colorScheme.onBackground,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Headlines",
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
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