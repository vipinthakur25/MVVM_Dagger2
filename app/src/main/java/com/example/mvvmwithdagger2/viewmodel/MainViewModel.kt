package com.example.mvvmwithdagger2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmwithdagger2.models.Product
import com.example.mvvmwithdagger2.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val productRepository: ProductRepository) : ViewModel() {

    val productLiveData: LiveData<List<Product>>
        get() = productRepository.products

    init {
        viewModelScope.launch {
            productRepository.getProducts()
        }
    }
}