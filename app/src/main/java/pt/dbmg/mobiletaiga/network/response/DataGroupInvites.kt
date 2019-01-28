package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupInvites(
    @SerializedName("attributes")
    val attributes: AttributesGroupInvites,
    @SerializedName("id")
    val id: String, // 28
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupInvites,
    @SerializedName("type")
    val type: String // groupInvites
)