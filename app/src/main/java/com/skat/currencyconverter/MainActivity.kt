package com.skat.currencyconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.skat.currencyconverter.ui.theme.CurrencyConverterTheme
import com.skat.currencyconverter.viewModel.CurrencyViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrencyConverterTheme {
                val viewModel: CurrencyViewModel = viewModel()
                viewModel.enableListCurrencies()
            }
        }
    }
}