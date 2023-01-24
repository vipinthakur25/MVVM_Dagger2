package com.example.mvvmwithdagger2.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmwithdagger2.models.Product
import com.example.mvvmwithdagger2.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerApi: FakerApi) {
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products

    suspend fun getProducts() {
        val result = fakerApi.getProducts()
        if (result.isSuccessful && result.body() != null) {
            _products.postValue(result.body())
        }
    }
}