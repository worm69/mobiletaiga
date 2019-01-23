package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesEpisodes(
    @SerializedName("airdate")
    val airdate: String, // 1998-04-01
    @SerializedName("canonicalTitle")
    val canonicalTitle: String, // The $$60 Billion Man
    @SerializedName("createdAt")
    val createdAt: String, // 2013-02-20T18:20:39.003Z
    @SerializedName("length")
    val length: Any, // null
    @SerializedName("number")
    val number: Int, // 1
    @SerializedName("relativeNumber")
    val relativeNumber: Int, // 1
    @SerializedName("seasonNumber")
    val seasonNumber: Int, // 1
    @SerializedName("synopsis")
    val synopsis: String, // There are many rumors circulating...
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String // 2014-11-18T16:20:14.856Z
)