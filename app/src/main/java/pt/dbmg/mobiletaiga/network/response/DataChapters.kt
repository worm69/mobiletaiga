package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataChapters(
    @SerializedName("attributes")
    val attributes: AttributesChapters,
    @SerializedName("id")
    val id: String, // 403830
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsChapters,
    @SerializedName("type")
    val type: String // chapters
)