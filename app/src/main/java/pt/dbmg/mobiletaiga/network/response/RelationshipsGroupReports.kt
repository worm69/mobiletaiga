package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsGroupReports(
    @SerializedName("group")
    val group: Group,
    @SerializedName("moderator")
    val moderator: Moderator,
    @SerializedName("naughty")
    val naughty: Naughty,
    @SerializedName("user")
    val user: User
)