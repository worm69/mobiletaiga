package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsGroupMemberNotes(
    @SerializedName("groupMember")
    val groupMember: GroupMember,
    @SerializedName("user")
    val user: User
)