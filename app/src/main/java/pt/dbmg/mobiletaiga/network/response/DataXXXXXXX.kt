package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXX,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXX,
    @SerializedName("type")
    val type: String // people
)