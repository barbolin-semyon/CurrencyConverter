package com.skat.currencyconverter.ui.features

import android.content.Context.MODE_PRIVATE
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.skat.currencyconverter.model.emptities.currenciesName
import com.skat.currencyconverter.ui.component.Spinner
import com.skat.currencyconverter.ui.theme.DarkGray
import com.skat.currencyconverter.viewModel.CurrencyViewModel

@Composable
fun ListScreen(navController: NavController, viewModel: CurrencyViewModel) {
    val currencies by viewModel.currencies.observeAsState()
    val context = LocalContext.current

    currencies?.let {
        if (it.isNotEmpty()) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                val keys = it.keys.toList()
                var baseCurrency by remember { mutableStateOf(keys[0]) }

                Header(keys, baseCurrency) { baseCurrency = it }

                LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    items(keys) { code ->
                        val preferences = context.getSharedPreferences("currencies", MODE_PRIVATE)
                        val oldValue = preferences.getFloat(code, 0f)

                        val newValue = currencies!![code]!!
                        if (newValue != oldValue) preferences.edit().putFloat(code, newValue)

                        ItemCurrency(code = code, newValue, oldValue)
                    }
                }
            }
        }
    }
}

@Composable
fun Header(keys: List<String>, baseCurrency: String, changeCurrency: (newValuew: String) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        backgroundColor = DarkGray,
        shape = RoundedCornerShape(bottomEnd = 16.dp, bottomStart = 16.dp),
        elevation = 16.dp
    ) {
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Базовая валюта",
                style = MaterialTheme.typography.h4,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Spinner(
                items = keys,
                hint = baseCurrency,
                tint = Color.White,
                padding = PaddingValues(8.dp),
                onClick = { changeCurrency(it) })

        }
    }
}

@Composable
fun ItemCurrency(code: String, value: Float, oldValue: Float) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Card(
                backgroundColor = DarkGray,
                modifier = Modifier
                    .width(60.dp)
                    .fillMaxHeight(),
            ) {
                Column(Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                    Text(
                        text = code,
                        color = Color.White,
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
            }

            Column {
                Text(text = currenciesName[code]!!, style = MaterialTheme.typography.h5)
                Row {
                    Text(text = "Значение: $value")

                    if (oldValue != 0f && oldValue != value) {
                        if (oldValue > value) {
                            Text("+${oldValue - value}", color = Color.Green)
                        } else {
                            Text("${oldValue - value}", color = Color.Red)
                        }
                    }
                }
            }
        }
    }
}