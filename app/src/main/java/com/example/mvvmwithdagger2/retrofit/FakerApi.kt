package com.example.mvvmwithdagger2.retrofit

import com.example.mvvmwithdagger2.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {
    @GET("products")
    suspend fun getProducts(): Response<List<Product>>
}