package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesXXXXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("content")
    val content: String, // The Anime \"Seinfeld\". Seriously, I love this show. It shines in it's dialog, and if you...
    @SerializedName("contentFormatted")
    val contentFormatted: String, // <p>The Anime \"Seinfeld\". Seriously, I love this show. It shines in it's dialog, and if you...
    @SerializedName("createdAt")
    val createdAt: String, // 2013-03-04T18:29:01.441Z
    @SerializedName("likesCount")
    val likesCount: Int, // 3
    @SerializedName("progress")
    val progress: Any, // null
    @SerializedName("rating")
    val rating: Int, // 20
    @SerializedName("source")
    val source: String, // hummingbird
    @SerializedName("spoiler")
    val spoiler: Boolean, // false
    @SerializedName("updatedAt")
    val updatedAt: String // 2016-12-19T08:01:58.532Z
)