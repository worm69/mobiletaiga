package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataMediaFollows(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsMediaFollows,
    @SerializedName("type")
    val type: String, // mediaFollows
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-07-27T22:47:45.129Z
)