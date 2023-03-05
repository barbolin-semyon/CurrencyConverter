package com.skat.currencyconverter.model.emptities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.Calendar

@Parcelize
data class ResultApiModel(
    val data: HashMap<String, Float> = hashMapOf(),
) : Parcelable

val currenciesName = hashMapOf<String, String> (
    Pair("EUR", "Euro"),
    Pair("USD", "US Dollar"),
    Pair("JPY", "Japanese Yen"),
    Pair("BGN", "Bulgarian Lev"),
    Pair("CZK", "Czech Republic Koruna"),
    Pair("DKK", "Danish Krone"),
    Pair("GBP", "British Pound Sterling"),
    Pair("HUF", "Hungarian Forint"),
    Pair("PLN", "Polish Zloty"),
    Pair("RON", "Romanian Leu"),
    Pair("SEK", "Swedish Krona"),
    Pair("CHF", "Swiss Franc"),
    Pair("ISK", "Icelandic Króna"),
    Pair("NOK", "Norwegian Krone"),
    Pair("HRK", "Croatian Kuna"),
    Pair("RUB", "Russian Ruble"),
    Pair("TRY", "Turkish Lira"),
    Pair("AUD", "Australian Dollar"),
    Pair("BRL", "Brazilian Real"),
    Pair("CAD", "Canadian Dollar"),
    Pair("CNY", "Chinese Yuan"),
    Pair("HKD", "Hong Kong Dollar"),
    Pair("IDR", "Indonesian Rupiah"),
    Pair("ILS", "Israeli New Sheqel"),
    Pair("INR", "Indian Rupee"),
    Pair("KRW", "South Korean Won"),
    Pair("MXN", "Mexican Peso"),
    Pair("MYR", "Malaysian Ringgit"),
    Pair("NZD", "New Zealand Dollar"),
    Pair("PHP", "Philippine Peso"),
    Pair("SGD", "Singapore Dollar"),
    Pair("THB", "Thai Baht"),
    Pair("ZAR", "South African Rand"),
)