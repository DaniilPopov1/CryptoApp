package com.example.cryptoapp.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

//TODO: PENIS HUI JOPA
data class CoinNameDto (
    @SerializedName("Name")
    @Expose
    val name: String? = null
)
