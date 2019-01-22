package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXXXXXXXXX,
    @SerializedName("id")
    val id: String, // 587798
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // stats
)