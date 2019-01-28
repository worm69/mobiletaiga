package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataMappings(
    @SerializedName("attributes")
    val attributes: AttributesMappings,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsMappings,
    @SerializedName("type")
    val type: String // mappings
)