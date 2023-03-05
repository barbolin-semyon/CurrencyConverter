package com.skat.currencyconverter.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.skat.currencyconverter.ui.features.ListScreen
import com.skat.currencyconverter.viewModel.CurrencyViewModel

@Composable
fun AppGraph(navController: NavHostController, viewModel: CurrencyViewModel) {
    NavHost(navController = navController, startDestination = Screens.List.route) {
        composable(Screens.Graph.route) {

        }

        composable(Screens.List.route) {
            ListScreen(navController = navController, viewModel = viewModel)
        }

        composable(Screens.Calculator.route) {

        }
    }
}