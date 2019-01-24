package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsGroups(
    @SerializedName("actionLogs")
    val actionLogs: ActionLogs,
    @SerializedName("category")
    val category: Category,
    @SerializedName("invites")
    val invites: Invites,
    @SerializedName("leaderChatMessages")
    val leaderChatMessages: LeaderChatMessages,
    @SerializedName("members")
    val members: Members,
    @SerializedName("neighbors")
    val neighbors: Neighbors,
    @SerializedName("pinnedPost")
    val pinnedPost: PinnedPost,
    @SerializedName("reports")
    val reports: Reports,
    @SerializedName("tickets")
    val tickets: Tickets
)