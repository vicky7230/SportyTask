package com.vicky7230.sportyproblem.ui.newsdetails

import android.content.res.Configuration
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.vicky7230.sportyproblem.ui.newsdetails.composables.NewsDetailsContent
import com.vicky7230.sportyproblem.ui.theme.SportyProblemTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsDetailsScreenUi(
    modifier: Modifier = Modifier,
    newsDetailsUiState: NewsDetailsUiState,
    onBackClick: () -> Unit
) {
    val state = newsDetailsUiState
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = if (state is NewsDetailsUiState.ArticleLoaded) state.articleDetails.title else "",
                        maxLines = 1
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) { padding: PaddingValues ->
        when (state) {
            NewsDetailsUiState.Idle -> Unit
            is NewsDetailsUiState.ArticleLoaded -> {
                NewsDetailsContent(
                    modifier =
                        Modifier
                            .fillMaxSize()
                            .padding(padding),
                    articleDetails = state.articleDetails
                )
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun PreviewNewsDetailsScreenUiLight(
    @PreviewParameter(NewsDetailsScreenPreviewParameterProvider::class) newsDetailsUiState: NewsDetailsUiState,
) {
    SportyProblemTheme(darkTheme = false) {
        NewsDetailsScreenUi(
            modifier = Modifier.fillMaxSize(),
            newsDetailsUiState = newsDetailsUiState,
            onBackClick = {}
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewNewsDetailsScreenUiDark(
    @PreviewParameter(NewsDetailsScreenPreviewParameterProvider::class) newsDetailsUiState: NewsDetailsUiState,
) {
    SportyProblemTheme(darkTheme = true) {
        NewsDetailsScreenUi(
            modifier = Modifier.fillMaxSize(),
            newsDetailsUiState = newsDetailsUiState,
            onBackClick = {}
        )
    }
}