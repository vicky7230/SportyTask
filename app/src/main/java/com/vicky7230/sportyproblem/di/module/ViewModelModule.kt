package com.vicky7230.sportyproblem.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vicky7230.sportyproblem.di.ViewModelFactory
import com.vicky7230.sportyproblem.di.ViewModelKey
import com.vicky7230.sportyproblem.ui.news.NewsViewModel


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
}