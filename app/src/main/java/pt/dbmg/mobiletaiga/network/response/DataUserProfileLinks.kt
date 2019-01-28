package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataUserProfileLinks(
    @SerializedName("attributes")
    val attributes: AttributesUserProfileLinks,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsUserProfileLinks,
    @SerializedName("type")
    val type: String // profileLinks
)