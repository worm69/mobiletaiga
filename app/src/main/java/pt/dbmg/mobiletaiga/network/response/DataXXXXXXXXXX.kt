package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXX,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXX,
    @SerializedName("type")
    val type: String // groupBans
)