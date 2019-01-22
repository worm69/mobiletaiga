package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesXXXXXXXXXXX(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-08-22T20:36:46.580Z
    @SerializedName("disabledReason")
    val disabledReason: Any, // null
    @SerializedName("externalUserId")
    val externalUserId: String, // synthtech
    @SerializedName("kind")
    val kind: String, // my-anime-list
    @SerializedName("shareFrom")
    val shareFrom: Boolean, // false
    @SerializedName("shareTo")
    val shareTo: Boolean, // false
    @SerializedName("syncTo")
    val syncTo: Boolean, // true
    @SerializedName("token")
    val token: Token,
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-08-22T20:36:46.580Z
)