package com.skat.currencyconverter.ui.navigation

import androidx.annotation.DrawableRes
import com.example.currencyconverter.R

sealed class Screens (val route: String, val icon: Int) {
    object Graph : Screens("graph", R.drawable.ic_graph)
    object Calculator : Screens("calculator", R.drawable.ic_calculator)
    object List : Screens("list", R.drawable.ic_list)
}