package com.vicky7230.sportyproblem.ui.news.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.vicky7230.sportyproblem.R
import com.vicky7230.sportyproblem.domain.model.Article
import com.vicky7230.sportyproblem.ui.news.articles
import com.vicky7230.sportyproblem.ui.theme.SportyProblemTheme

@Composable
fun NewsItem(
    modifier: Modifier = Modifier,
    article: Article,
    onNewsArticleClick: (Article) -> Unit,
) {
    Row(modifier = modifier.clickable { onNewsArticleClick(article) }) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(article.urlToImage)
                .crossfade(true)
                .build(),
            contentDescription = "Article Image",
            placeholder = painterResource(R.drawable.ic_loading),
            error = painterResource(R.drawable.ic_error),
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(12.dp))
        )
        Column(modifier = Modifier.padding(start = 8.dp)) {
            Text(
                text = article.title,
                style = TextStyle(
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                ),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = article.description,
                style = TextStyle(
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                ),
                maxLines = 4,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewsItemPreview() {
    SportyProblemTheme {
        NewsItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            article = articles[0],
            onNewsArticleClick = {}
        )
    }
}