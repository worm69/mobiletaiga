package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupActionLogs(
    @SerializedName("attributes")
    val attributes: AttributesGroupActionLogs,
    @SerializedName("id")
    val id: String, // 647
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupActionLogs,
    @SerializedName("type")
    val type: String // groupActionLogs
)