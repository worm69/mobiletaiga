package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Likes(
    @SerializedName("links")
    val links: Links2
)