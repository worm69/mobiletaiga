package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataMediaAttributes(
    @SerializedName("attributes")
    val attributes: AttributesMediaAttributes,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsMediaAttributes,
    @SerializedName("type")
    val type: String // mediaAttributes
)