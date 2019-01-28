package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("parameter")
    val parameter: String,
    @SerializedName("pointer")
    val pointer: String
)