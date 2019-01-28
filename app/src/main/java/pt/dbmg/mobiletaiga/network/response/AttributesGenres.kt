package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGenres(
    @SerializedName("createdAt")
    val createdAt: String, // 2013-02-20T16:00:15.623Z
    @SerializedName("description")
    val description: Any, // null
    @SerializedName("name")
    val name: String, // Action
    @SerializedName("slug")
    val slug: String, // action
    @SerializedName("updatedAt")
    val updatedAt: String // 2016-07-17T19:30:56.164Z
)