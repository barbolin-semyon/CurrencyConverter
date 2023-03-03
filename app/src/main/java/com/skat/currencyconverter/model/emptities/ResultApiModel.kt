package com.skat.currencyconverter.model.emptities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.util.Calendar

@Parcelize
data class ResultApiModel(
    val date: Calendar = Calendar.getInstance(),

    @ColumnInfo("data")
    val data: Valutes = Valutes(),
) : Parcelable

@Parcelize
data class Valutes(
    val AUD: Double = 0.0,
    val BGN: Double = 0.0,
    val BRL: Double = 0.0,
    val CAD: Double = 0.0,
    val CHF: Double = 0.0,
    val CNY: Double = 0.0,
    val CZK: Double = 0.0,
    val DKK: Double = 0.0,
    val EUR: Double = 0.0,
    val GBP: Double = 0.0,
    val HKD: Double = 0.0,
    val HUF: Double = 0.0,
    val IDR: Double = 0.0,
    val ILS: Double = 0.0,
    val INR: Double = 0.0,
    val ISK: Double = 0.0,
    val JPY: Double = 0.0,
    val KRW: Double = 0.0,
    val MXN: Double = 0.0,
    val MYR: Double = 0.0,
    val NOK: Double = 0.0,
    val PLN: Double = 0.0,
    val RON: Double = 0.0,
    val RUB: Double = 0.0,
    val SEK: Double = 0.0,
    val SGD: Double = 0.0,
    val THB: Double = 0.0,
    val TRY: Double = 0.0,
    val USD: Double = 0.0,
    val ZAR: Double = 0.0,

) : Parcelable {
    fun getListValutes(): List<Double> {
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
