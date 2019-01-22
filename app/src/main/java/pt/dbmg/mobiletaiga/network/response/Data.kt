package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String, // 10
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: Relationships,
    @SerializedName("type")
    val type: String // animeCharacters
)