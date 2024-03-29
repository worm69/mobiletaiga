package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataPostFollows(
    @SerializedName("attributes")
    val attributes: Attributes2,
    @SerializedName("id")
    val id: String, // 3
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsPostFollows,
    @SerializedName("type")
    val type: String // postFollows
)