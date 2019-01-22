package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXX,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("type")
    val type: String // groupCategories
)