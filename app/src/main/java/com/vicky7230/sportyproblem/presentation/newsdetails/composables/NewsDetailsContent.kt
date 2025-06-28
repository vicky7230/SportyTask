package com.vicky7230.sportyproblem.presentation.newsdetails.composables

import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.vicky7230.sportyproblem.R
import com.vicky7230.sportyproblem.presentation.newsdetails.ArticleDetails
import com.vicky7230.sportyproblem.presentation.theme.SportyProblemTheme
import androidx.core.net.toUri

@Composable
fun NewsDetailsContent(
    modifier: Modifier = Modifier,
    articleDetails: ArticleDetails
) {
    val context = LocalContext.current

    ElevatedCard(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
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
                    .aspectRatio(16f / 9f)
                    .clip(MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop,
            )

            Text(
                text = articleDetails.title,
                style = MaterialTheme.typography.headlineSmall,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            HorizontalDivider()

            Text(
                text = articleDetails.description,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 4,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = articleDetails.content,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 6,
                overflow = TextOverflow.Ellipsis
            )

            ElevatedButton(
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW, articleDetails.url.toUri())
                    context.startActivity(intent)
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            ) {
                Text(
                    text = "Read Full Article",
                    style = MaterialTheme.typography.labelLarge,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun NewsDetailsContentPreviewLight() {
    SportyProblemTheme(darkTheme = false) {
        NewsDetailsContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            articleDetails = ArticleDetails(
                title = "Diddy used ‘power, violence and fear,’ prosecutors say in closing arguments - The Washington Post",
                description = "In Sean ‘Diddy’ Combs’s trial, closing arguments began Thursday as the prosecution made its final pitch to jurors. They will hear from the defense on Friday.",
                content = "NEW YORK Sean Diddy Combs used power, violence and fear to run a criminal enterprise, prosecutors said Thursday as they walked jurors through a road map of testimony and evidence during closing argum… [+9306 chars]",
                urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/75CSFRPKVIQIQCS7J7ANSTOAQQ.JPG&w=1440",
                url = "https://www.washingtonpost.com/entertainment/music/2025/06/26/diddy-trial-closing-arguments-sean-combs-sex-trafficking/"
            )
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun NewsDetailsContentPreviewDark() {
    SportyProblemTheme(darkTheme = true) {
        NewsDetailsContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            articleDetails = ArticleDetails(
                title = "Diddy used ‘power, violence and fear,’ prosecutors say in closing arguments - The Washington Post",
                description = "In Sean ‘Diddy’ Combs’s trial, closing arguments began Thursday as the prosecution made its final pitch to jurors. They will hear from the defense on Friday.",
                content = "NEW YORK Sean Diddy Combs used power, violence and fear to run a criminal enterprise, prosecutors said Thursday as they walked jurors through a road map of testimony and evidence during closing argum… [+9306 chars]",
                urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/75CSFRPKVIQIQCS7J7ANSTOAQQ.JPG&w=1440",
                url = "https://www.washingtonpost.com/business/2025/06/26/trump-tax-bill-revolt-house-senate/"
            )
        )
    }
}