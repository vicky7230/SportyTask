package com.vicky7230.sportyproblem.presentation.newsdetails

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class NewsDetailsScreenPreviewParameterProvider : PreviewParameterProvider<NewsDetailsUiState> {
    override val values =
        sequenceOf(
            NewsDetailsUiState.Idle,
            NewsDetailsUiState.ArticleLoaded(article),
        )
}

val article = ArticleDetails(
    title = "Diddy used ‘power, violence and fear,’ prosecutors say in closing arguments - The Washington Post",
    description = "In Sean ‘Diddy’ Combs’s trial, closing arguments began Thursday as the prosecution made its final pitch to jurors. They will hear from the defense on Friday.",
    content = "NEW YORK Sean Diddy Combs used power, violence and fear to run a criminal enterprise, prosecutors said Thursday as they walked jurors through a road map of testimony and evidence during closing argum… [+9306 chars]",
    urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/75CSFRPKVIQIQCS7J7ANSTOAQQ.JPG&w=1440",
    url = "https://www.washingtonpost.com/entertainment/music/2025/06/26/diddy-trial-closing-arguments-sean-combs-sex-trafficking/"
)