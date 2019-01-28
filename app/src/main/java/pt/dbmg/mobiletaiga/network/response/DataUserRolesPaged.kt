package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataUserRolesPaged(
    @SerializedName("attributes")
    val attributes: AttributesUserRoles,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsUserRoles,
    @SerializedName("type")
    val type: String // roles
)