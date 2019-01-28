package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesUserRoles(
    @SerializedName("createdAt")
    val createdAt: String, // 2016-12-12T14:32:06.707Z
    @SerializedName("name")
    val name: String, // admin
    @SerializedName("resourceId")
    val resourceId: Any, // null
    @SerializedName("resourceType")
    val resourceType: Any, // null
    @SerializedName("updatedAt")
    val updatedAt: String // 2016-12-12T14:32:06.707Z
)