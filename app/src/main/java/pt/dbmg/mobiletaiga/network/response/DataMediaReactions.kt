package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataMediaReactions(
    @SerializedName("attributes")
    val attributes: AttributesMediaReactions,
    @SerializedName("id")
    val id: String, // 4
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsMediaReactions,
    @SerializedName("type")
    val type: String // mediaReactions
)