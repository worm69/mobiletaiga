package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsUsersBlocks(
    @SerializedName("blocked")
    val blocked: Blocked,
    @SerializedName("user")
    val user: User
)