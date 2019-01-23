package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesFranchises(
    @SerializedName("canonicalTitle")
    val canonicalTitle: Any, // null
    @SerializedName("createdAt")
    val createdAt: String, // 2013-07-07T07:44:54.484Z
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String // 2013-07-07T07:44:54.484Z
)