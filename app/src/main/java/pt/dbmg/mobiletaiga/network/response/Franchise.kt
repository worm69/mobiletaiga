package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Franchise(
    @SerializedName("links")
    val links: Links2,
    @SerializedName("media")
    val media: MediaX
)