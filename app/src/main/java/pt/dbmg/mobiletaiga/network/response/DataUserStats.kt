package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataUserStats(
    @SerializedName("attributes")
    val attributes: AttributesUserStats,
    @SerializedName("id")
    val id: String, // 587798
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsUserStats,
    @SerializedName("type")
    val type: String // stats
)