package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class CategoriesResource(
    @SerializedName("data")
    val `data`: List<DataCategories>
)