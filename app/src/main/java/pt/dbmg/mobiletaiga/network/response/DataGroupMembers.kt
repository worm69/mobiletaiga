package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupMembers(
    @SerializedName("attributes")
    val attributes: AttributesGroupMembers,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupMembers,
    @SerializedName("type")
    val type: String // groupMembers
)