package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsXXXXXXXXXX(
    @SerializedName("group")
    val group: Group,
    @SerializedName("moderator")
    val moderator: Moderator,
    @SerializedName("user")
    val user: User
)