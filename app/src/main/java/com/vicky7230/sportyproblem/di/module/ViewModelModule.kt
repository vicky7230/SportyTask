package com.vicky7230.sportyproblem.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vicky7230.sportyproblem.di.AssistedViewModelFactory
import com.vicky7230.sportyproblem.di.ViewModelFactory
import com.vicky7230.sportyproblem.di.ViewModelKey
import com.vicky7230.sportyproblem.presentation.news.NewsViewModel
import com.vicky7230.sportyproblem.presentation.newsdetails.NewsDetailsViewModel


import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NewsViewModel::class)
    abstract fun bindNewsViewModel(newsViewModel: NewsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(NewsDetailsViewModel::class)
    abstract fun bindNewsDetailsViewModel(
        factory: NewsDetailsViewModel.Factory,
    ): @JvmSuppressWildcards AssistedViewModelFactory<out ViewModel>
}