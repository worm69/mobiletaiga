package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataFranchises(
    @SerializedName("attributes")
    val attributes: AttributesFranchises,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsFranchises,
    @SerializedName("type")
    val type: String // franchises
)