package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Anime(
    @SerializedName("links")
    val links: Links2
)