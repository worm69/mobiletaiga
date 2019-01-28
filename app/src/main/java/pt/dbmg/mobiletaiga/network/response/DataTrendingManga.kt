package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataTrendingManga(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String, // 14916
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsTrendingManga,
    @SerializedName("type")
    val type: String // manga
)