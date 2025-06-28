package com.vicky7230.sportyproblem.di.module

import com.vicky7230.sportyproblem.data.local.RemoteDataSource
import com.vicky7230.sportyproblem.data.local.RemoteDataSourceImpl
import com.vicky7230.sportyproblem.data.repo.NewsRepoImpl
import com.vicky7230.sportyproblem.domain.repo.NewsRepo
import dagger.Binds
import dagger.Module

@Module
abstract class BindingModule {
    @Binds
    abstract fun bindRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource

    @Binds
    abstract fun bindTodoRepository(newsRepoImpl: NewsRepoImpl): NewsRepo
}