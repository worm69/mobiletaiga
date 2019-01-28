package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesChapters(
    @SerializedName("canonicalTitle")
    val canonicalTitle: String, // Mission 01: Magical Five
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("length")
    val length: String, // 80
    @SerializedName("number")
    val number: Int, // 1
    @SerializedName("published")
    val published: String, // 2015-06-25
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String, // 2017-07-27T22:47:45.129Z
    @SerializedName("volumeNumber")
    val volumeNumber: Int // 1
)