package com.vicky7230.sportyproblem.navigation

import kotlinx.serialization.Serializable


@Serializable
object NewsAppGraph

@Serializable
object NewsScreen

@Serializable
data class NewsDetailsScreen(
    val title: String,
    val description: String,
    val content: String,
    val urlToImage: String,
    val url: String
)