package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroupPermissions(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-03-12T05:12:42.823Z
    @SerializedName("permission")
    val permission: String, // community
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-03-12T05:12:42.823Z
)