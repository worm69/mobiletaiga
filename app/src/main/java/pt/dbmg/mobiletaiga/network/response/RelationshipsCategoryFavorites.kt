package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsCategoryFavorites(
    @SerializedName("category")
    val category: Category,
    @SerializedName("user")
    val user: User
)