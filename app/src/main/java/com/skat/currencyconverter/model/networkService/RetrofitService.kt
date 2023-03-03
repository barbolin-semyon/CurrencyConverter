package com.skat.currencyconverter.model.networkService

import com.skat.currencyconverter.model.emptities.ResultApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface RetrofitService {
    @GET("latest")
    fun getCurrencies(@Header("apikey") apikey: String): Call<ResultApiModel>
}