package com.example.foodpoint.api.food_class


import com.google.gson.annotations.SerializedName

data class X400X(
    @SerializedName("h")
    val h: Int,
    @SerializedName("w")
    val w: Int
)