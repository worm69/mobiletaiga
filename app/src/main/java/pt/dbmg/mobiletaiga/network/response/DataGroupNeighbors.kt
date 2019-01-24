package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupNeighbors(
    @SerializedName("attributes")
    val attributes: AttributesGroupNeighbors,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupNeighbors,
    @SerializedName("type")
    val type: String // groupNeighbors
)