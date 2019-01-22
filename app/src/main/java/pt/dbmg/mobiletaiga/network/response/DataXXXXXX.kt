package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXX(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXX,
    @SerializedName("type")
    val type: String // mangaStaff
)