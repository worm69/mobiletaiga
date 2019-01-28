package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class NextUnit(
    @SerializedName("links")
    val links: Links2
)