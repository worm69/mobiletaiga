package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataLeaderChatMessages(
    @SerializedName("attributes")
    val attributes: AttributesLeaderChatMessages,
    @SerializedName("id")
    val id: String, // 19
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsLeaderChatMessages,
    @SerializedName("type")
    val type: String // leaderChatMessages
)