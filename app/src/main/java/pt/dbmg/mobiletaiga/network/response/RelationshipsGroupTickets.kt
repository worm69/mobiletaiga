package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsGroupTickets(
    @SerializedName("assignee")
    val assignee: Assignee,
    @SerializedName("firstMessage")
    val firstMessage: FirstMessage,
    @SerializedName("group")
    val group: Group,
    @SerializedName("messages")
    val messages: Messages,
    @SerializedName("user")
    val user: User
)