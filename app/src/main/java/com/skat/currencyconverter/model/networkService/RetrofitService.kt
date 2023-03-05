package com.skat.currencyconverter.model.networkService

import com.skat.currencyconverter.model.emptities.ResultApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RetrofitService {
    @GET("latest")
    fun getCurrentCurrencies(
        @Query("base_currency") baseCurrency: String,
        @Header("apikey") apikey: String
    ): Call<ResultApiModel>
}