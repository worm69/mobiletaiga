package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsUserUserRoles(
    @SerializedName("role")
    val role: Role,
    @SerializedName("user")
    val user: User
)