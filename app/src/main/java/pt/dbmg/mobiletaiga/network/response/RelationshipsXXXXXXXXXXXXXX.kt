package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsXXXXXXXXXXXXXX(
    @SerializedName("followed")
    val followed: Followed,
    @SerializedName("follower")
    val follower: Follower
)