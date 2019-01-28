package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsGroupInvites(
    @SerializedName("group")
    val group: Group,
    @SerializedName("sender")
    val sender: Sender,
    @SerializedName("user")
    val user: User
)