package com.example.mvvmwithdagger2

import android.app.Application
import com.example.mvvmwithdagger2.di.ApplicationComponent
import com.example.mvvmwithdagger2.di.DaggerApplicationComponent


class FakerApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}