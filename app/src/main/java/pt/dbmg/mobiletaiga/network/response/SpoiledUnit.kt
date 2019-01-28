package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class SpoiledUnit(
    @SerializedName("links")
    val links: Links2
)