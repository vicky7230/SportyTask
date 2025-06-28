package com.vicky7230.sportyproblem.ui.newsdetails.composables

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
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
import com.vicky7230.sportyproblem.ui.newsdetails.ArticleDetails
import com.vicky7230.sportyproblem.ui.theme.SportyProblemTheme

@Composable
fun NewsDetailsContent(
    modifier: Modifier = Modifier,
    articleDetails: ArticleDetails
) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(articleDetails.urlToImage)
                .crossfade(true)
                .build(),
            contentDescription = "Article Image",
            placeholder = painterResource(R.drawable.ic_loading),
            error = painterResource(R.drawable.ic_error),
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop,
        )
        Text(
            text = articleDetails.title,
            style = TextStyle(
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
            ),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = articleDetails.description,
            style = TextStyle(
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            ),
            maxLines = 4,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = articleDetails.content,
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

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun NewsDetailsContentPreviewLight() {
    SportyProblemTheme(darkTheme = false) {
        NewsDetailsContent(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            articleDetails = ArticleDetails(
                title = "Diddy used ‘power, violence and fear,’ prosecutors say in closing arguments - The Washington Post",
                description = "In Sean ‘Diddy’ Combs’s trial, closing arguments began Thursday as the prosecution made its final pitch to jurors. They will hear from the defense on Friday.",
                content = "NEW YORK Sean Diddy Combs used power, violence and fear to run a criminal enterprise, prosecutors said Thursday as they walked jurors through a road map of testimony and evidence during closing argum… [+9306 chars]",
                urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/75CSFRPKVIQIQCS7J7ANSTOAQQ.JPG&w=1440"
            )
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun NewsDetailsContentPreviewDark() {
    SportyProblemTheme(darkTheme = true) {
        NewsDetailsContent(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            articleDetails = ArticleDetails(
                title = "Diddy used ‘power, violence and fear,’ prosecutors say in closing arguments - The Washington Post",
                description = "In Sean ‘Diddy’ Combs’s trial, closing arguments began Thursday as the prosecution made its final pitch to jurors. They will hear from the defense on Friday.",
                content = "NEW YORK Sean Diddy Combs used power, violence and fear to run a criminal enterprise, prosecutors said Thursday as they walked jurors through a road map of testimony and evidence during closing argum… [+9306 chars]",
                urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/75CSFRPKVIQIQCS7J7ANSTOAQQ.JPG&w=1440"
            )
        )
    }
}