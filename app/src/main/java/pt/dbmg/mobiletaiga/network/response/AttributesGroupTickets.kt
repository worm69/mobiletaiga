package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroupTickets(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-06-16T09:11:46.042Z
    @SerializedName("status")
    val status: String, // resolved
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-07-24T20:02:51.697Z
)