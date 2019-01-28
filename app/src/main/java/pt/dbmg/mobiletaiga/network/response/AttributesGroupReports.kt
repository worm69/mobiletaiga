package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroupReports(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-03-12T05:12:42.823Z
    @SerializedName("explanation")
    val explanation: Any, // null
    @SerializedName("naughtyId")
    val naughtyId: Int, // 1
    @SerializedName("naughtyType")
    val naughtyType: String, // Comment
    @SerializedName("reason")
    val reason: String, // nsfw
    @SerializedName("status")
    val status: String, // reported
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-03-12T05:12:42.823Z
)