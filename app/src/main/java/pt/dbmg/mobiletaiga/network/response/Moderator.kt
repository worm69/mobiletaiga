package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Moderator(
    @SerializedName("links")
    val links: Links2
)