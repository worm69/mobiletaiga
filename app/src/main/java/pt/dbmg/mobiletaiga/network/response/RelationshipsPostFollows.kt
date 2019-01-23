package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsPostFollows(
    @SerializedName("post")
    val post: Post,
    @SerializedName("user")
    val user: User
)