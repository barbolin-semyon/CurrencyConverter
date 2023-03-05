package com.skat.currencyconverter.ui.component

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Spinner(
    items: List<String>,
    hint: String,
    tint: Color,
    padding: PaddingValues,
    onClick: (item: String) -> Unit
) {
    var isExpand by remember { mutableStateOf(false) }

    Box(contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier
                .padding(padding)
                .border(2.dp, color = Color.White),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = hint,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                color = tint,
                modifier = Modifier.padding(8.dp)
            )

            Icon(
                painter = painterResource(id = com.example.currencyconverter.R.drawable.ic_arrow_bottom),
                contentDescription = "to expand",
                Modifier
                    .size(48.dp)
                    .clickable { isExpand = isExpand.not() },
                tint = tint
            )

            DropdownMenu(
                expanded = isExpand,
                onDismissRequest = { isExpand = false },
                modifier = Modifier.fillMaxWidth()
            ) {
                for (item in items) {
                    DropdownMenuItem(onClick = {
                        onClick(item)
                        isExpand = false
                    }) {
                        Text(text = item)
                    }
                }
            }
        }
    }
}