package com.vicky7230.sportyproblem.data.model

import kotlinx.serialization.Serializable

@Serializable
data class SourceDto(
    val id: String = "",
    val name: String = ""
) {
    companion object {
        val EMPTY = SourceDto()
    }
}