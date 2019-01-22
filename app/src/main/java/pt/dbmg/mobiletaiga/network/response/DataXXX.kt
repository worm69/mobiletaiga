package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXX(
    @SerializedName("attributes")
    val attributes: AttributesXX,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsXXX,
    @SerializedName("type")
    val type: String // characters
)