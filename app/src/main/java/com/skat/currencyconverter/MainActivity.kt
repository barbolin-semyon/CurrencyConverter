package com.skat.currencyconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.skat.currencyconverter.ui.navigation.AppGraph
import com.skat.currencyconverter.ui.theme.CurrencyConverterTheme
import com.skat.currencyconverter.ui.theme.DarkGray
import com.skat.currencyconverter.viewModel.CurrencyViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrencyConverterTheme {
                val uiController = rememberSystemUiController()
                uiController.setStatusBarColor(DarkGray)

                val viewModel: CurrencyViewModel = viewModel()
                viewModel.enableListCurrencies()

                val navController = rememberNavController()

                AppGraph(navController = navController, viewModel = viewModel)
            }
        }
    }
}