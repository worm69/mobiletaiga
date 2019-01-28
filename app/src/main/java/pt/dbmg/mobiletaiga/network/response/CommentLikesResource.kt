package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class CommentLikesResource(
    @SerializedName("data")
    val `data`: List<DataCommentLikes>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)