package com.skat.currencyconverter.model.emptities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.Calendar

@Parcelize
data class ResultApiModel(
    val date: Calendar = Calendar.getInstance(),
    val data: HashMap<String, Double> = hashMapOf(),
) : Parcelable

