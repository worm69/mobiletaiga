package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class CategoryFavoritesResource(
    @SerializedName("data")
    val `data`: List<DataCategoryFavorites>
)