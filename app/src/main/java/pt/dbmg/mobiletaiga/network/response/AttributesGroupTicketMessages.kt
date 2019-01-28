package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroupTicketMessages(
    @SerializedName("content")
    val content: String, // Could u please add this recap episode to the series...
    @SerializedName("createdAt")
    val createdAt: String, // 2017-06-16T09:11:46.241Z
    @SerializedName("kind")
    val kind: String, // message
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-06-16T09:11:46.241Z
)