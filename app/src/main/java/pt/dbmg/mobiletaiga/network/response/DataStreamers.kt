package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataStreamers(
    @SerializedName("attributes")
    val attributes: AttributesStreamers,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsStreamers,
    @SerializedName("type")
    val type: String // streamers
)