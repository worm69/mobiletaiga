package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesStreamingLinks(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("dubs")
    val dubs: List<String>,
    @SerializedName("subs")
    val subs: List<String>,
    @SerializedName("updatedAt")
    val updatedAt: String, // 2017-07-27T22:47:45.129Z
    @SerializedName("url")
    val url: String // http://www.hulu.com/hacklegend-of-the-twilight
)