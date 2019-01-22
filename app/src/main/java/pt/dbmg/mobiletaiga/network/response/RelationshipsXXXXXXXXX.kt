package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsXXXXXXXXX(
    @SerializedName("group")
    val group: Group,
    @SerializedName("target")
    val target: Target,
    @SerializedName("user")
    val user: User
)