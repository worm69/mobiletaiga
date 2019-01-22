package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXXXXXXXX,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // roles
)