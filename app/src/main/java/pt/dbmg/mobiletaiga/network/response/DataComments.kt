package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataComments(
    @SerializedName("attributes")
    val attributes: AttributesComments,
    @SerializedName("id")
    val id: String, // 7760392
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsComments,
    @SerializedName("type")
    val type: String // comments
)