package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesMediaAttributes(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("highTitle")
    val highTitle: String,
    @SerializedName("lowTitle")
    val lowTitle: String,
    @SerializedName("neutralTitle")
    val neutralTitle: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-07-27T22:47:45.129Z
)