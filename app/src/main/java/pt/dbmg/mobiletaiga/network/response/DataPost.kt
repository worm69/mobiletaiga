package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataPost(
    @SerializedName("attributes")
    val attributes: AttributesPost,
    @SerializedName("id")
    val id: String, // 167585
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsPost,
    @SerializedName("type")
    val type: String // posts
)