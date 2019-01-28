package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesMappings(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("externalId")
    val externalId: String, // 31608
    @SerializedName("externalSite")
    val externalSite: String, // myanimelist/anime
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-07-27T22:47:45.129Z
)