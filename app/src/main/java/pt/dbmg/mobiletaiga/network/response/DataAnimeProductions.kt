package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataAnimeProductions(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsAnimeProductions,
    @SerializedName("type")
    val type: String // animeProductions
)