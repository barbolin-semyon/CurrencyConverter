package com.skat.currencyconverter.model.networkService

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var retrofitService: Retrofit? = null

    fun getRetrofitService(): Retrofit {
        if (retrofitService == null) {
            retrofitService = Retrofit.Builder()
                .baseUrl("https://api.freecurrencyapi.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        return retrofitService!!
    }
}