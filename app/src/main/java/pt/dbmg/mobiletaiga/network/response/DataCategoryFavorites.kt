package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataCategoryFavorites(
    @SerializedName("attributes")
    val attributes: Attributes2,
    @SerializedName("id")
    val id: String, // 2
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsCategoryFavorites,
    @SerializedName("type")
    val type: String // categoryFavorites
)