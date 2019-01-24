package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsGroupMembers(
    @SerializedName("group")
    val group: Group,
    @SerializedName("notes")
    val notes: Notes,
    @SerializedName("permissions")
    val permissions: Permissions,
    @SerializedName("user")
    val user: User
)