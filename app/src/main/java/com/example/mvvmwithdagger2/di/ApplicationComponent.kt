package com.example.mvvmwithdagger2.di

import com.example.mvvmwithdagger2.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}