package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsUserRoles(
    @SerializedName("resource")
    val resource: Resource,
    @SerializedName("userRoles")
    val userRoles: UserRoles
)