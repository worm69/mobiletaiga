package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("id")
    val id: String, // 4
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // mediaReactions
)