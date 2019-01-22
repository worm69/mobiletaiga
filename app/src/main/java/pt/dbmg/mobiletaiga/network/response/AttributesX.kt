package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesX(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("featured")
    val featured: Boolean, // false
    @SerializedName("language")
    val language: String, // English
    @SerializedName("role")
    val role: String, // producer
    @SerializedName("updatedAt")
    val updatedAt: String, // 2017-07-27T22:47:45.129Z
    @SerializedName("voiceActor")
    val voiceActor: Boolean // false
)