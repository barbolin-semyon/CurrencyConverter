package com.skat.currencyconverter.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.List.route) {
        composable(Screens.Graph.route) {

        }

        composable(Screens.List.route) {

        }

        composable(Screens.Calculator.route) {

        }
    }
}