package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RowData(
    val imgPizza: Int,
    val namePizza: String,
    val nameRestaurant: String,
    val imgHeart: Int,
    val imgBasket: Int
):Parcelable

