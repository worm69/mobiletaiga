package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesLeaderChatMessages(
    @SerializedName("content")
    val content: String, // Does this work?
    @SerializedName("contentFormatted")
    val contentFormatted: String, // <p>Does this work?</p>\n
    @SerializedName("createdAt")
    val createdAt: String, // 2017-03-12T17:23:36.640Z
    @SerializedName("editedAt")
    val editedAt: String, // 2017-03-12T17:23:36.640Z
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-03-12T17:23:36.640Z
)