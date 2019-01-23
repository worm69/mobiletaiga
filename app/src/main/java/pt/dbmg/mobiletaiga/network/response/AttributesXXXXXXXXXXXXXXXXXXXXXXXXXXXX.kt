package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("blocked")
    val blocked: Boolean, // false
    @SerializedName("commentsCount")
    val commentsCount: Int, // 13
    @SerializedName("content")
    val content: String, // I like cats. http://i.imgur.com/mJBJfzf.jpg
    @SerializedName("contentFormatted")
    val contentFormatted: String, // I like cats. <a href="http://i.imgur.com/mJBJfzf.jpg" target="_blank">...
    @SerializedName("createdAt")
    val createdAt: String, // 2013-06-21T20:15:54.522Z
    @SerializedName("deletedAt")
    val deletedAt: Any, // null
    @SerializedName("editedAt")
    val editedAt: Any, // null
    @SerializedName("embed")
    val embed: Any, // null
    @SerializedName("embedUrl")
    val embedUrl: Any, // null
    @SerializedName("nsfw")
    val nsfw: Boolean, // false
    @SerializedName("postLikesCount")
    val postLikesCount: Int, // 2
    @SerializedName("spoiler")
    val spoiler: Boolean, // false
    @SerializedName("targetInterest")
    val targetInterest: Any, // null
    @SerializedName("topLevelCommentsCount")
    val topLevelCommentsCount: Int, // 12
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-06-27T14:08:22.843Z
)