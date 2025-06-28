package com.vicky7230.sportyproblem.ui.common

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.vicky7230.sportyproblem.ui.theme.SportyProblemTheme

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LoadingScreenPreviewLight() {
    SportyProblemTheme(darkTheme = false) {
        LoadingScreen(modifier = Modifier.fillMaxSize())
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun LoadingScreenPreviewDark() {
    SportyProblemTheme(darkTheme = true) {
        LoadingScreen(modifier = Modifier.fillMaxSize())
    }
}