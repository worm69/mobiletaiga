package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataStreamingLinks(
    @SerializedName("attributes")
    val attributes: AttributesStreamingLinks,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsStreamingLinks,
    @SerializedName("type")
    val type: String // streamingLinks
)