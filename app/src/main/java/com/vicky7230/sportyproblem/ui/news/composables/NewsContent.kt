package com.vicky7230.sportyproblem.ui.news.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vicky7230.sportyproblem.domain.model.Article
import com.vicky7230.sportyproblem.ui.news.articles
import com.vicky7230.sportyproblem.ui.theme.SportyProblemTheme
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
    ) {
        itemsIndexed(articles) { index, article ->
            NewsItem(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                article = article,
                onNewsArticleClick = onNewsArticleClick
            )
            if (index < articles.size - 1) {
                HorizontalDivider(modifier = Modifier.padding(start = 128.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewsContentPreview() {
    SportyProblemTheme {
        NewsContent(
            modifier = Modifier.fillMaxSize(),
            articles = articles,
            onNewsArticleClick = {}
        )
    }
}