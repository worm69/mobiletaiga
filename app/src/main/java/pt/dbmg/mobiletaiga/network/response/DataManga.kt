package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataManga(
    @SerializedName("attributes")
    val attributes: AttributesManga,
    @SerializedName("id")
    val id: String, // 14916
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsManga,
    @SerializedName("type")
    val type: String // manga
)