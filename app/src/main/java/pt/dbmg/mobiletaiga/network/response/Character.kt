package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("links")
    val links: Links2
)