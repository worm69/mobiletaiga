package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserLinkedAccountsPaged(
    @SerializedName("data")
    val `data`: List<DataXXXXXXXXXXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)