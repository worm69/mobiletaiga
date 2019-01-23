package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Large(
    @SerializedName("height")
    val height: Any, // null
    @SerializedName("width")
    val width: Any // null
)