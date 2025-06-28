package com.vicky7230.sportyproblem.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.vicky7230.sportyproblem.ui.news.NewsScreenUi
import com.vicky7230.sportyproblem.ui.news.NewsViewModel
import com.vicky7230.sportyproblem.ui.newsdetails.NewsDetailsScreenUi
import com.vicky7230.sportyproblem.ui.newsdetails.NewsDetailsViewModel

@Composable
fun AppNavGraph(
    navController: NavHostController,
    viewModelFactory: ViewModelProvider.Factory,
) {
    NavHost(navController = navController, startDestination = NewsAppGraph) {
        navigation<NewsAppGraph>(startDestination = NewsScreen) {
            composable<NewsScreen> { navBackStackEntry: NavBackStackEntry ->
                val newsViewModel =
                    viewModel<NewsViewModel>(
                        viewModelStoreOwner = navBackStackEntry,
                        factory = viewModelFactory,
                    )
                val state by newsViewModel.newsUiState.collectAsStateWithLifecycle()
                NewsScreenUi(
                    modifier = Modifier.fillMaxSize(),
                    newsUiState = state,
                    onNewsArticleClick = { article ->
                        navController.navigate(
                            NewsDetailsScreen(
                                title = article.title,
                                description = article.description,
                                content = article.content,
                                urlToImage = article.urlToImage
                            )
                        )
                    },
                    onRetryClick = { newsViewModel.getNews() }
                )
            }
            composable<NewsDetailsScreen> { navBackStackEntry: NavBackStackEntry ->
                val articleTitle = navBackStackEntry.arguments?.getString("title") ?: ""
                val articleDescription = navBackStackEntry.arguments?.getString("description") ?: ""
                val articleContent = navBackStackEntry.arguments?.getString("content") ?: ""
                val articleUrlToImage = navBackStackEntry.arguments?.getString("urlToImage") ?: ""
                val newsDetailsViewModel =
                    viewModel<NewsDetailsViewModel>(
                        viewModelStoreOwner = navBackStackEntry,
                        factory = viewModelFactory,
                    )
                val state by newsDetailsViewModel.newsDetailsUiState.collectAsStateWithLifecycle()
                NewsDetailsScreenUi(
                    modifier = Modifier.fillMaxSize(),
                    newsDetailsUiState = state,
                    onBackClick  = { navController.popBackStack() },
                )
            }
        }
    }
}