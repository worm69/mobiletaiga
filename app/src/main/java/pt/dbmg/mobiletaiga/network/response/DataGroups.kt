package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroups(
    @SerializedName("attributes")
    val attributes: AttributesGroups,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsGroups,
    @SerializedName("type")
    val type: String // groups
)