package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("id")
    val id: String, // 3
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // commentLikes
)