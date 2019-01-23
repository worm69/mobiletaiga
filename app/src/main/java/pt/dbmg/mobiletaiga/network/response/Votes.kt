package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Votes(
    @SerializedName("links")
    val links: Links2
)