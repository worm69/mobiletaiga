package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataCategories(
    @SerializedName("attributes")
    val attributes: AttributesCategories,
    @SerializedName("id")
    val id: String, // 10
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsCategories,
    @SerializedName("type")
    val type: String // categories
)