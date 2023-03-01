package com.skat.currencyconverter.model.networkService

import com.skat.currencyconverter.model.emptities.ResultApiModel
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("daily_json.js")
    fun getCurrencies(): Call<ResultApiModel>
}