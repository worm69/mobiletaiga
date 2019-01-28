package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsGroupPermissions(
    @SerializedName("groupMember")
    val groupMember: GroupMember
)