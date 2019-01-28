package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataCharacters(
    @SerializedName("attributes")
    val attributes: AttributesCharacters,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsCharacters,
    @SerializedName("type")
    val type: String // characters
)