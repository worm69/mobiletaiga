package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataUsersBlocks(
    @SerializedName("attributes")
    val attributes: Attributes2,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsUsersBlocks,
    @SerializedName("type")
    val type: String // blocks
)