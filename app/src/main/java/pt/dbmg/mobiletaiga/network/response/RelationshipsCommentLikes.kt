package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsCommentLikes(
    @SerializedName("comment")
    val comment: Comment,
    @SerializedName("user")
    val user: User
)