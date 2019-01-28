package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsLeaderChatMessages(
    @SerializedName("group")
    val group: Group,
    @SerializedName("user")
    val user: User
)