package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataMediaRelationships(
    @SerializedName("attributes")
    val attributes: AttributesMediaRelationships,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsMediaRelationships,
    @SerializedName("type")
    val type: String // mediaRelationships
)