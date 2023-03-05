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
    val data: HashMap<String, Double> = hashMapOf(),
) : Parcelable

