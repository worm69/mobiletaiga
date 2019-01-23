package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("id")
    val id: String, // 167585
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // posts
)