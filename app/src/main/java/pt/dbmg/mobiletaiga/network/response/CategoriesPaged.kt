package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class CategoriesPaged(
    @SerializedName("data")
    val `data`: List<DataCategories>,
    @SerializedName("links")
    val links: Links2,
    @SerializedName("meta")
    val meta: Meta
)