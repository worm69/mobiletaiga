package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataCastings(
    @SerializedName("attributes")
    val attributes: AttributesCastings,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsCastings,
    @SerializedName("type")
    val type: String // castings
)