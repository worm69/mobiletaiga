package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupPermissions(
    @SerializedName("attributes")
    val attributes: AttributesGroupPermissions,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupPermissions,
    @SerializedName("type")
    val type: String // groupPermissions
)