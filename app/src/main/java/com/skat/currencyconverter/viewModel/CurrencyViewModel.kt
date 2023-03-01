package com.skat.currencyconverter.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.skat.currencyconverter.model.emptities.ResultApiModel
import com.skat.currencyconverter.model.emptities.Valute
import com.skat.currencyconverter.model.networkService.RetrofitClient
import com.skat.currencyconverter.model.networkService.RetrofitService
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CurrencyViewModel : ViewModel() {
    private val _currencies = MutableLiveData<List<Valute>>(emptyList())
    val currencies: LiveData<List<Valute>>
        get() = _currencies

    private val listener = MutableLiveData(true)
    private val db = RetrofitClient.getRetrofitService().create(RetrofitService::class.java)

    fun enableListCurrencies() = viewModelScope.launch {
        while (listener.value == true) {
            delay(5000)
            db.getCurrencies().enqueue(object : Callback<ResultApiModel> {
                override fun onResponse(
                    call: Call<ResultApiModel>,
                    response: Response<ResultApiModel>
                ) {
                    val body = response.body()
                    body?.let {
                        _currencies.value = listOf()
                    }
                }

                override fun onFailure(call: Call<ResultApiModel>, t: Throwable) {
                    Log.i("QWE", "")
                }

            })
        }
    }
}