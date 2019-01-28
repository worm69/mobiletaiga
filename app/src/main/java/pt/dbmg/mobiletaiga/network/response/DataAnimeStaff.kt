package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataAnimeStaff(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsAnimeStaff,
    @SerializedName("type")
    val type: String // animeStaff
)