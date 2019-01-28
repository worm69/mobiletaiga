package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataLibraryEntryLogsPaged(
    @SerializedName("attributes")
    val attributes: AttributesLibraryEntryLogs,
    @SerializedName("id")
    val id: String, // 917564
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsLibraryEntryLogs,
    @SerializedName("type")
    val type: String // libraryEntryLogs
)