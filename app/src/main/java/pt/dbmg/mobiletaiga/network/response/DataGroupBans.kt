package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupBans(
    @SerializedName("attributes")
    val attributes: AttributesGroupBans,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupBans,
    @SerializedName("type")
    val type: String // groupBans
)