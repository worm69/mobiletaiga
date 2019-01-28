package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesUserProfileLinks(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("updatedAt")
    val updatedAt: String, // 2017-07-27T22:47:45.129Z
    @SerializedName("url")
    val url: String // https://github.com/vevix
)