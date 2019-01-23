package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesCategories(
    @SerializedName("childCount")
    val childCount: Int, // 0
    @SerializedName("createdAt")
    val createdAt: String, // 2017-05-31T06:38:31.311Z
    @SerializedName("description")
    val description: String, // The origin of Elves (Norse; álfar(elves), álfr(elf)) can be found in ancient Norse mythology...
    @SerializedName("image")
    val image: ImageX,
    @SerializedName("nsfw")
    val nsfw: Boolean, // false
    @SerializedName("slug")
    val slug: String, // elf
    @SerializedName("title")
    val title: String, // Elf
    @SerializedName("totalMediaCount")
    val totalMediaCount: Int, // 40
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-05-31T06:39:36.873Z
)