package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsPost(
    @SerializedName("ama")
    val ama: Ama,
    @SerializedName("comments")
    val comments: Comments,
    @SerializedName("media")
    val media: Media,
    @SerializedName("postLikes")
    val postLikes: PostLikes,
    @SerializedName("spoiledUnit")
    val spoiledUnit: SpoiledUnit,
    @SerializedName("targetGroup")
    val targetGroup: TargetGroup,
    @SerializedName("targetUser")
    val targetUser: TargetUser,
    @SerializedName("uploads")
    val uploads: Uploads,
    @SerializedName("user")
    val user: User
)