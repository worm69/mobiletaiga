package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataAnime(
    @SerializedName("attributes")
    val attributes: AttributesAnime,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: Relationships,
    @SerializedName("type")
    val type: String // anime
)