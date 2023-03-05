package com.skat.currencyconverter.ui.features

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.skat.currencyconverter.model.emptities.currenciesName
import com.skat.currencyconverter.ui.theme.DarkGray
import com.skat.currencyconverter.viewModel.CurrencyViewModel

@Composable
fun ListScreen(navController: NavController, viewModel: CurrencyViewModel) {
    val currencies by viewModel.currencies.observeAsState()

    currencies?.let {
        LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            items(it.keys.toList()) { code ->
                ItemCurrency(code = code, currencies!![code]!!)
            }
        }
    }
}

@Composable
fun ItemCurrency(code: String, value: Double) {
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
            Card(backgroundColor = DarkGray, modifier = Modifier
                .width(60.dp)
                .fillMaxHeight(), ) {
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
                Text(text = "Значение: $value")
            }
        }
    }
}