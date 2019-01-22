package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXX,
    @SerializedName("id")
    val id: String, // 647
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXX,
    @SerializedName("type")
    val type: String // groupActionLogs
)