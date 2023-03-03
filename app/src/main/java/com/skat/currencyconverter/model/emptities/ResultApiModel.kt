package com.skat.currencyconverter.model.emptities

import com.google.gson.annotations.SerializedName

data class ResultApiModel(
    @SerializedName("Date")
    val data: Valutes = Valutes(),
)

data class Valutes(
    val AUD: Valute = Valute(),
    val BGN: Valute = Valute(),
    val BRL: Valute = Valute(),
    val CAD: Valute = Valute(),
    val CHF: Valute = Valute(),
    val CNY: Valute = Valute(),
    val CZK: Valute = Valute(),
    val DKK: Valute = Valute(),
    val EUR: Valute = Valute(),
    val GBP: Valute = Valute(),
    val HKD: Valute = Valute(),
    val HUF: Valute = Valute(),
    val IDR: Valute = Valute(),
    val ILS: Valute = Valute(),
    val INR: Valute = Valute(),
    val ISK: Valute = Valute(),
    val JPY: Valute = Valute(),
    val KRW: Valute = Valute(),
    val MXN: Valute = Valute(),
    val MYR: Valute = Valute(),
    val NOK: Valute = Valute(),
    val NZD: Valute = Valute(),
    val PHP: Valute = Valute(),
    val PLN: Valute = Valute(),
    val RON: Valute = Valute(),
    val RUB: Valute = Valute(),
    val SEK: Valute = Valute(),
    val SGD: Valute = Valute(),
    val THB: Valute = Valute(),
    val TRY: Valute = Valute(),
    val USD: Valute = Valute(),
    val ZAR: Valute = Valute(),

) {
    fun getListValutes(): List<Valute> {
        return listOf(
            AUD,
            BGN,
            BRL,
            CAD,
            CHF,
            CNY,
            CZK,
            DKK,
            EUR,
            GBP,
            HKD,
            HUF,
            IDR,
            ILS,
            INR,
            ISK,
            JPY,
            KRW,
            MXN,
            MYR,
            NOK,
            NZD,
            PHP,
            PLN,
            RON,
            RUB,
            SEK,
            SGD,
            THB,
            TRY,
            USD,
            ZAR
        )
    }
}
