package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataCommentLikes(
    @SerializedName("attributes")
    val attributes: Attributes2,
    @SerializedName("id")
    val id: String, // 3
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsCommentLikes,
    @SerializedName("type")
    val type: String // commentLikes
)