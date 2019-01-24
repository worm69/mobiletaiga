package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroupMembers(
    @SerializedName("createdAt")
    val createdAt: String, // 2015-02-17T21:16:53.211Z
    @SerializedName("rank")
    val rank: String, // admin
    @SerializedName("unreadCount")
    val unreadCount: Int, // 16
    @SerializedName("updatedAt")
    val updatedAt: String // 2015-02-17T21:16:53.211Z
)