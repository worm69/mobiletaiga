package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXXXXXXXXXXXXX,
    @SerializedName("id")
    val id: String, // 917564
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // libraryEntryLogs
)