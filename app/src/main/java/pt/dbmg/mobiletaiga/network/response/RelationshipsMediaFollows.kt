package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsMediaFollows(
    @SerializedName("media")
    val media: MediaX,
    @SerializedName("user")
    val user: User
)