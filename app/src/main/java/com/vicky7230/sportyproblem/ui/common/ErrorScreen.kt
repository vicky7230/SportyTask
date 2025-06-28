package com.vicky7230.sportyproblem.ui.common

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vicky7230.sportyproblem.R
import com.vicky7230.sportyproblem.ui.theme.SportyProblemTheme

@Composable
fun ErrorScreen(
    message: String,
    onRetryClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {

            Image(
                modifier = Modifier.size(80.dp),
                painter = painterResource(R.drawable.ic_error),
                contentDescription = "Error image",
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.error)
            )
            Text(
                text = message,
                style =
                    TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray,
                    ),
                textAlign = TextAlign.Center
            )
            Button(
                onClick = onRetryClick,
                colors = ButtonDefaults.buttonColors().copy(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                    disabledContainerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
                    disabledContentColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
                ),
            ) {
                Text(
                    text = "RETRY",
                    style =
                        TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                        ),
                )
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ErrorScreenPreviewLight() {
    SportyProblemTheme(darkTheme = false) {
        ErrorScreen(
            modifier = Modifier.fillMaxSize(),
            onRetryClick = { },
            message = "Something went wrong! Please try again later."
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ErrorScreenPreviewDark() {
    SportyProblemTheme(darkTheme = true) {
        ErrorScreen(
            modifier = Modifier.fillMaxSize(),
            onRetryClick = { },
            message = "Something went wrong! Please try again later."
        )
    }
}