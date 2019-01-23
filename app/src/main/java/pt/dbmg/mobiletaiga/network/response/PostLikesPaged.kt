package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class PostLikesPaged(
    @SerializedName("data")
    val `data`: List<DataXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)