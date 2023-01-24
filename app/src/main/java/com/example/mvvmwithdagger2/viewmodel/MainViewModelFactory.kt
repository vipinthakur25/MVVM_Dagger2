package com.example.mvvmwithdagger2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmwithdagger2.repository.ProductRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor (private val productRepository: ProductRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       return MainViewModel(productRepository) as T
    }
}