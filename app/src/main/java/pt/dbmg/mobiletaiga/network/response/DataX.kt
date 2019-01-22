package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataX(
    @SerializedName("attributes")
    val attributes: AttributesX,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsX,
    @SerializedName("type")
    val type: String // castings
)