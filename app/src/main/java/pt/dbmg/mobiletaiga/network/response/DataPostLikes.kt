package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataPostLikes(
    @SerializedName("attributes")
    val attributes: Attributes2,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsPostLikes,
    @SerializedName("type")
    val type: String // postLikes
)