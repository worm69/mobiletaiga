package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesXXXXXXXXXXXXXXX(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-28T02:14:07.389Z
    @SerializedName("kind")
    val kind: String, // anime-category-breakdown
    @SerializedName("statsData")
    val statsData: StatsData,
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-10-20T19:07:02.241Z
)