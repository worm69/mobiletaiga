package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroupMemberNotes(
    @SerializedName("content")
    val content: Any, // null
    @SerializedName("contentFormatted")
    val contentFormatted: Any, // null
    @SerializedName("createdAt")
    val createdAt: String, // 2017-03-12T16:55:27.999Z
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-03-12T19:45:12.292Z
)