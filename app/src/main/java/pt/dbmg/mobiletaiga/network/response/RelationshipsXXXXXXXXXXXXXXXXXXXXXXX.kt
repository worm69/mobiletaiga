package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsXXXXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("mediaReaction")
    val mediaReaction: MediaReactionX,
    @SerializedName("user")
    val user: User
)