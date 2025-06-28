package com.vicky7230.sportyproblem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vicky7230.sportyproblem.navigation.AppNavGraph
import com.vicky7230.sportyproblem.presentation.theme.SportyProblemTheme
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SportyProblemTheme {
                val navController = rememberNavController()
                App(navHostController = navController, viewModelFactory = viewModelFactory)
            }
        }
    }
}

@Composable
fun App(
    navHostController: NavHostController,
    viewModelFactory: ViewModelProvider.Factory
) {
    Surface(
        modifier =
            Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.systemBars)
                .windowInsetsPadding(WindowInsets.navigationBars),
        color = MaterialTheme.colorScheme.background,
    ) {
        AppNavGraph(
            navController = navHostController,
            viewModelFactory = viewModelFactory,
        )
    }
}
