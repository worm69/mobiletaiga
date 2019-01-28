package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsReviewLikes(
    @SerializedName("review")
    val review: Review,
    @SerializedName("user")
    val user: User
)