package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataUserFavorites(
    @SerializedName("attributes")
    val attributes: AttributesUserFavorites,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsUserFavorites,
    @SerializedName("type")
    val type: String // favorites
)