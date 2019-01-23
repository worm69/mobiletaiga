package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataEpisodes(
    @SerializedName("attributes")
    val attributes: AttributesEpisodes,
    @SerializedName("id")
    val id: String, // 28
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsEpisodes,
    @SerializedName("type")
    val type: String // episodes
)