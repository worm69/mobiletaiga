package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroupCategories(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-03-12T06:24:28.884Z
    @SerializedName("description")
    val description: String,
    @SerializedName("name")
    val name: String, // Anime & Manga
    @SerializedName("slug")
    val slug: String, // anime-manga
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-03-12T06:24:28.884Z
)