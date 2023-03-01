package com.skat.currencyconverter.model.emptities

import com.google.gson.annotations.SerializedName

data class Valute(
    @SerializedName("ID")
    val id: String = "",

    @SerializedName("NumCode")
    val numCode: String = "",

    @SerializedName("CharCode")
    val charCode: String = "",

    @SerializedName("Nominal")
    val nominal: String = "",

    @SerializedName("Name")
    val name: String = "",

    @SerializedName("Value")
    val value: String = "",

    @SerializedName("Previous")
    val Previous: String = "",
)
