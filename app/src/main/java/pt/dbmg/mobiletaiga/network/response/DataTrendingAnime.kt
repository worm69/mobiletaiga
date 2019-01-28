package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataTrendingAnime(
    @SerializedName("attributes")
    val attributes: AttributesTrendingAnime,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsTrendingAnime,
    @SerializedName("type")
    val type: String // anime
)