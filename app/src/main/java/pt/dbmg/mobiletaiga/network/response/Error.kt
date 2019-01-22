package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Error(
    @SerializedName("code")
    val code: String,
    @SerializedName("detail")
    val detail: String,
    @SerializedName("source")
    val source: Source,
    @SerializedName("status")
    val status: String,
    @SerializedName("title")
    val title: String
)