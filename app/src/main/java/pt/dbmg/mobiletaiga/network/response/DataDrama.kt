package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataDrama(
    @SerializedName("attributes")
    val attributes: AttributesDrama,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsDrama,
    @SerializedName("type")
    val type: String // drama
)