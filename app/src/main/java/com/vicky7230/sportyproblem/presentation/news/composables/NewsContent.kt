package com.vicky7230.sportyproblem.presentation.news.composables

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vicky7230.sportyproblem.domain.model.Article
import com.vicky7230.sportyproblem.presentation.news.articles
import com.vicky7230.sportyproblem.presentation.theme.SportyProblemTheme
import kotlinx.collections.immutable.PersistentList


@Composable
fun NewsContent(
    modifier: Modifier = Modifier,
    articles: PersistentList<Article>,
    onNewsArticleClick: (Article) -> Unit,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itemsIndexed(articles, key = { index, item -> item.url }, ) { index, article ->
            NewsItem(
                modifier = Modifier
                    .fillMaxWidth(),
                article = article,
                onNewsArticleClick = onNewsArticleClick
            )
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun NewsContentPreviewLight() {
    SportyProblemTheme(darkTheme = false) {
        NewsContent(
            modifier = Modifier.fillMaxSize(),
            articles = articles,
            onNewsArticleClick = {}
        )
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun NewsContentPreviewDark() {
    SportyProblemTheme(darkTheme = true) {
        NewsContent(
            modifier = Modifier.fillMaxSize(),
            articles = articles,
            onNewsArticleClick = {}
        )
    }
}