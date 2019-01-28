package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataReviews(
    @SerializedName("attributes")
    val attributes: AttributesReviews,
    @SerializedName("id")
    val id: String, // 4
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsReviews,
    @SerializedName("type")
    val type: String // reviews
)