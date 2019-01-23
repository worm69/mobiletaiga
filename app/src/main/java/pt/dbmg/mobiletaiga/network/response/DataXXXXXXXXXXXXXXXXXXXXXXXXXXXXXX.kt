package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("id")
    val id: String, // 7760392
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // comments
)