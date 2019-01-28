package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupReports(
    @SerializedName("attributes")
    val attributes: AttributesGroupReports,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupReports,
    @SerializedName("type")
    val type: String // groupReports
)