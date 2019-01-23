package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesComments(
    @SerializedName("blocked")
    val blocked: Boolean, // false
    @SerializedName("content")
    val content: String, // This is a test.
    @SerializedName("contentFormatted")
    val contentFormatted: String, // This is a test.
    @SerializedName("createdAt")
    val createdAt: String, // 2014-08-07T19:08:14.364Z
    @SerializedName("deletedAt")
    val deletedAt: Any, // null
    @SerializedName("editedAt")
    val editedAt: Any, // null
    @SerializedName("embed")
    val embed: Any, // null
    @SerializedName("embedUrl")
    val embedUrl: Any, // null
    @SerializedName("likesCount")
    val likesCount: Int, // 0
    @SerializedName("repliesCount")
    val repliesCount: Int, // 0
    @SerializedName("updatedAt")
    val updatedAt: String // 2014-08-07T19:08:14.364Z
)