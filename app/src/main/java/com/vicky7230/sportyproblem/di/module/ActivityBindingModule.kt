package com.vicky7230.sportyproblem.di.module

import com.vicky7230.sportyproblem.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}