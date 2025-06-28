package com.vicky7230.sportyproblem.di

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

interface AssistedViewModelFactory<T : ViewModel> {
    fun create(savedStateHandle: SavedStateHandle): T
}