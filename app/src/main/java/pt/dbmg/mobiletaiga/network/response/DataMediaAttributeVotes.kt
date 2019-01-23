package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataMediaAttributeVotes(
    @SerializedName("attributes")
    val attributes: AttributesMediaAttributeVotes,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsMediaAttributeVotes,
    @SerializedName("type")
    val type: String // mediaAttributeVotes
)