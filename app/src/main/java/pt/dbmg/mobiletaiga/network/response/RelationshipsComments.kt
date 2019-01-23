package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsComments(
    @SerializedName("likes")
    val likes: Likes,
    @SerializedName("parent")
    val parent: Parent,
    @SerializedName("post")
    val post: Post,
    @SerializedName("replies")
    val replies: Replies,
    @SerializedName("uploads")
    val uploads: Uploads,
    @SerializedName("user")
    val user: User
)