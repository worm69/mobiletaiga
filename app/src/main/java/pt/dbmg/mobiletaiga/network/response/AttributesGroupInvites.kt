package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroupInvites(
    @SerializedName("acceptedAt")
    val acceptedAt: String, // 2017-03-12T19:45:12.186Z
    @SerializedName("createdAt")
    val createdAt: String, // 2017-03-12T16:55:27.999Z
    @SerializedName("declinedAt")
    val declinedAt: Any, // null
    @SerializedName("revokedAt")
    val revokedAt: Any, // null
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-03-12T19:45:12.292Z
)