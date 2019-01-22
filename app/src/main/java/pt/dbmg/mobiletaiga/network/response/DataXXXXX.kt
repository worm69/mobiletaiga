package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXX(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXX,
    @SerializedName("type")
    val type: String // mangaCharacters
)