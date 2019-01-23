package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataMediaReactionVotes(
    @SerializedName("attributes")
    val attributes: Attributes2,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsMediaReactionVotes,
    @SerializedName("type")
    val type: String // mediaReactionVotes
)