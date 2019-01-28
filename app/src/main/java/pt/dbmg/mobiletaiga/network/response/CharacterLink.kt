package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class CharacterLink(
    @SerializedName("links")
    val links: Links2
)