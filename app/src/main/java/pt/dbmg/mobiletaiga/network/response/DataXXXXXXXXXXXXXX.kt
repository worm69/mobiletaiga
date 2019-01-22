package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXXXX,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // favorites
)