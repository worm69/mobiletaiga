package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserProfileLinksPaged(
    @SerializedName("data")
    val `data`: List<DataXXXXXXXXXXXXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)