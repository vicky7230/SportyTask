package com.vicky7230.sportyproblem.presentation.news

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.vicky7230.sportyproblem.domain.model.Article
import kotlinx.collections.immutable.persistentListOf

class NewsScreenPreviewParameterProvider : PreviewParameterProvider<NewsUiState> {
    override val values =
        sequenceOf(
            NewsUiState.Idle,
            NewsUiState.Loading,
            NewsUiState.Error("Error, something went wrong!"),
            NewsUiState.ArticlesLoaded(articles),
        )
}

val articles = persistentListOf(
    Article(
        title = "Diddy used ‘power, violence and fear,’ prosecutors say in closing arguments - The Washington Post",
        description = "In Sean ‘Diddy’ Combs’s trial, closing arguments began Thursday as the prosecution made its final pitch to jurors. They will hear from the defense on Friday.",
        content = "NEW YORK Sean Diddy Combs used power, violence and fear to run a criminal enterprise, prosecutors said Thursday as they walked jurors through a road map of testimony and evidence during closing argum… [+9306 chars]",
        urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/75CSFRPKVIQIQCS7J7ANSTOAQQ.JPG&w=1440",
        url = "https://www.washingtonpost.com/entertainment/music/2025/06/26/diddy-trial-closing-arguments-sean-combs-sex-trafficking/",
        publishedAt = "2025-06-27T02:00:25Z",
        source = "The Washington Post"
    ),
    Article(
        title = "House GOP holdouts threaten revolt over Trump and Senate’s tax bill - The Washington Post",
        description = "The Senate has overhauled President Donald Trump’s One Big Beautiful Bill, sparking serious concerns over federal spending and social programs in the House.",
        urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/UHB43R3KW5VWUCEHN4WOFUVZIM.JPG&w=1440",
        content = "As Senate Republicans eye the finish line on President Donald Trumps massive tax and immigration proposal, there may be one more obstacle standing in the way of what they hope will be era-defining le… [+8002 chars]",
        url = "https://www.washingtonpost.com/business/2025/06/26/trump-tax-bill-revolt-house-senate/",
        publishedAt = "2025-06-27T01:09:13Z",
        source = "The Washington Post"
    ),
    Article(
        title = "Diddy used ‘power, violence and fear,’ prosecutors say in closing arguments - The Washington Post",
        description = "In Sean ‘Diddy’ Combs’s trial, closing arguments began Thursday as the prosecution made its final pitch to jurors. They will hear from the defense on Friday.",
        content = "NEW YORK Sean Diddy Combs used power, violence and fear to run a criminal enterprise, prosecutors said Thursday as they walked jurors through a road map of testimony and evidence during closing argum… [+9306 chars]",
        urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/75CSFRPKVIQIQCS7J7ANSTOAQQ.JPG&w=1440",
        url = "https://www.washingtonpost.com/entertainment/music/2025/06/26/diddy-trial-closing-arguments-sean-combs-sex-trafficking/",
        publishedAt = "2025-06-27T02:00:25Z",
        source = "The Washington Post"
    ),
    Article(
        title = "House GOP holdouts threaten revolt over Trump and Senate’s tax bill - The Washington Post",
        description = "The Senate has overhauled President Donald Trump’s One Big Beautiful Bill, sparking serious concerns over federal spending and social programs in the House.",
        urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/UHB43R3KW5VWUCEHN4WOFUVZIM.JPG&w=1440",
        content = "As Senate Republicans eye the finish line on President Donald Trumps massive tax and immigration proposal, there may be one more obstacle standing in the way of what they hope will be era-defining le… [+8002 chars]",
        url = "https://www.washingtonpost.com/business/2025/06/26/trump-tax-bill-revolt-house-senate/",
        publishedAt = "2025-06-27T01:09:13Z",
        source = "The Washington Post"
    ),
    Article(
        title = "Diddy used ‘power, violence and fear,’ prosecutors say in closing arguments - The Washington Post",
        description = "In Sean ‘Diddy’ Combs’s trial, closing arguments began Thursday as the prosecution made its final pitch to jurors. They will hear from the defense on Friday.",
        content = "NEW YORK Sean Diddy Combs used power, violence and fear to run a criminal enterprise, prosecutors said Thursday as they walked jurors through a road map of testimony and evidence during closing argum… [+9306 chars]",
        urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/75CSFRPKVIQIQCS7J7ANSTOAQQ.JPG&w=1440",
        url = "https://www.washingtonpost.com/entertainment/music/2025/06/26/diddy-trial-closing-arguments-sean-combs-sex-trafficking/",
        publishedAt = "2025-06-27T02:00:25Z",
        source = "The Washington Post"
    ),
    Article(
        title = "House GOP holdouts threaten revolt over Trump and Senate’s tax bill - The Washington Post",
        description = "The Senate has overhauled President Donald Trump’s One Big Beautiful Bill, sparking serious concerns over federal spending and social programs in the House.",
        urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/UHB43R3KW5VWUCEHN4WOFUVZIM.JPG&w=1440",
        content = "As Senate Republicans eye the finish line on President Donald Trumps massive tax and immigration proposal, there may be one more obstacle standing in the way of what they hope will be era-defining le… [+8002 chars]",
        url = "https://www.washingtonpost.com/business/2025/06/26/trump-tax-bill-revolt-house-senate/",
        publishedAt = "2025-06-27T01:09:13Z",
        source = "The Washington Post"
    ),
    Article(
        title = "Diddy used ‘power, violence and fear,’ prosecutors say in closing arguments - The Washington Post",
        description = "In Sean ‘Diddy’ Combs’s trial, closing arguments began Thursday as the prosecution made its final pitch to jurors. They will hear from the defense on Friday.",
        content = "NEW YORK Sean Diddy Combs used power, violence and fear to run a criminal enterprise, prosecutors said Thursday as they walked jurors through a road map of testimony and evidence during closing argum… [+9306 chars]",
        urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/75CSFRPKVIQIQCS7J7ANSTOAQQ.JPG&w=1440",
        url = "https://www.washingtonpost.com/entertainment/music/2025/06/26/diddy-trial-closing-arguments-sean-combs-sex-trafficking/",
        publishedAt = "2025-06-27T02:00:25Z",
        source = "The Washington Post"
    ),
    Article(
        title = "House GOP holdouts threaten revolt over Trump and Senate’s tax bill - The Washington Post",
        description = "The Senate has overhauled President Donald Trump’s One Big Beautiful Bill, sparking serious concerns over federal spending and social programs in the House.",
        urlToImage = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/UHB43R3KW5VWUCEHN4WOFUVZIM.JPG&w=1440",
        content = "As Senate Republicans eye the finish line on President Donald Trumps massive tax and immigration proposal, there may be one more obstacle standing in the way of what they hope will be era-defining le… [+8002 chars]",
        url = "https://www.washingtonpost.com/business/2025/06/26/trump-tax-bill-revolt-house-senate/",
        publishedAt = "2025-06-27T01:09:13Z",
        source = "The Washington Post"
    )
)