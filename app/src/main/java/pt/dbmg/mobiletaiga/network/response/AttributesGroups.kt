package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroups(
    @SerializedName("about")
    val about: String, // Group for fans of the One Piece anime and or manga...
    @SerializedName("avatar")
    val avatar: Avatar,
    @SerializedName("coverImage")
    val coverImage: CoverImage,
    @SerializedName("createdAt")
    val createdAt: String, // 2015-02-17T21:16:53.207Z
    @SerializedName("featured")
    val featured: Boolean, // false
    @SerializedName("lastActivityAt")
    val lastActivityAt: String, // 2017-10-26T17:56:45.259Z
    @SerializedName("leadersCount")
    val leadersCount: Int, // 2
    @SerializedName("locale")
    val locale: Any, // null
    @SerializedName("membersCount")
    val membersCount: Int, // 548
    @SerializedName("name")
    val name: String, // One Piece group
    @SerializedName("neighborsCount")
    val neighborsCount: Int, // 0
    @SerializedName("nsfw")
    val nsfw: Boolean, // false
    @SerializedName("privacy")
    val privacy: String, // open
    @SerializedName("rules")
    val rules: Any, // null
    @SerializedName("rulesFormatted")
    val rulesFormatted: Any, // null
    @SerializedName("slug")
    val slug: String, // one-piece-group
    @SerializedName("tagline")
    val tagline: Any, // null
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-10-26T20:51:24.215Z
)