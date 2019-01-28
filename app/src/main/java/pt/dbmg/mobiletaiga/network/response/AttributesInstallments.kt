package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesInstallments(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("position")
    val position: Int, // 0
    @SerializedName("tag")
    val tag: Any, // null
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-07-27T22:47:45.129Z
)