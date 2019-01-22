package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXX,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXX,
    @SerializedName("type")
    val type: String // producers
)