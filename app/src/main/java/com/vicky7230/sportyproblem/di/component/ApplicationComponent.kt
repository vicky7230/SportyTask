package com.vicky7230.sportyproblem.di.component

import com.vicky7230.sportyproblem.SportyApp
import com.vicky7230.sportyproblem.di.module.ActivityBindingModule
import com.vicky7230.sportyproblem.di.module.BindingModule
import com.vicky7230.sportyproblem.di.module.NetworkModule
import com.vicky7230.sportyproblem.di.module.ViewModelModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        NetworkModule::class,
        BindingModule::class,
        ActivityBindingModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {
    fun inject(sportyApp: SportyApp)
}