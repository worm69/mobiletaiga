package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataLibraryEvents(
    @SerializedName("attributes")
    val attributes: AttributesLibraryEvents,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsLibraryEvents,
    @SerializedName("type")
    val type: String // libraryEvents
)