package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataLibraryEntries(
    @SerializedName("attributes")
    val attributes: AttributesLibraryEntries,
    @SerializedName("id")
    val id: String, // 1644
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsLibraryEntries,
    @SerializedName("type")
    val type: String // libraryEntries
)