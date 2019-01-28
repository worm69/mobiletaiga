package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsUserFavorites(
    @SerializedName("item")
    val item: Item,
    @SerializedName("user")
    val user: User
)