package com.skat.currencyconverter.model.emptities

import com.google.gson.annotations.SerializedName

data class ResultApiModel(
    @SerializedName("Date")
    val Date: String = "",

    @SerializedName("Timestamp")
    val timestamp: String = "",

    @SerializedName("Valutes")
    val Valutes: Valutes = Valutes(),
)

data class Valutes(
    val AUD: Valute = Valute(),
    val AZN: Valute = Valute(),
    val GBP: Valute = Valute(),
    val AMD: Valute = Valute(),
    val BYN: Valute = Valute(),
    val BGN: Valute = Valute(),
    val BRL: Valute = Valute(),
    val HUF: Valute = Valute(),
    val VND: Valute = Valute(),
    val HKD: Valute = Valute(),
    val GEL: Valute = Valute(),
    val DKK: Valute = Valute(),
    val AED: Valute = Valute(),
    val USD: Valute = Valute(),
    val EUR: Valute = Valute(),
    val EGP: Valute = Valute(),
    val INR: Valute = Valute(),
    val IDR: Valute = Valute(),
    val KZT: Valute = Valute(),
    val CAD: Valute = Valute(),
    val QAR: Valute = Valute(),
    val KGS: Valute = Valute(),
    val CNY: Valute = Valute(),
    val MDL: Valute = Valute(),
    val NZD: Valute = Valute(),
    val NOK: Valute = Valute(),
    val PLN: Valute = Valute(),
    val RON: Valute = Valute(),
    val XDR: Valute = Valute(),
    val SGD: Valute = Valute(),
    val TJS: Valute = Valute(),
    val THB: Valute = Valute(),
    val TRY: Valute = Valute(),
    val TMT: Valute = Valute(),
    val UZS: Valute = Valute(),
    val UAH: Valute = Valute(),
    val CZK: Valute = Valute(),
    val SEK: Valute = Valute(),
    val CHF: Valute = Valute(),
    val RSD: Valute = Valute(),
    val ZAR: Valute = Valute(),
    val KRW: Valute = Valute(),
    val JPY: Valute = Valute(),
)
