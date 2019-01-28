package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesStreamers(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("logo")
    val logo: Any, // null
    @SerializedName("siteName")
    val siteName: String, // Hulu
    @SerializedName("streamingLinksCount")
    val streamingLinksCount: Int, // 760
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-07-27T22:47:45.129Z
)