package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class PostFollowsPaged(
    @SerializedName("data")
    val `data`: List<DataXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)