package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsUserStats(
    @SerializedName("user")
    val user: User
)