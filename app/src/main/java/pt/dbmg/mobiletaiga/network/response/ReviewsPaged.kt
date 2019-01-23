package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class ReviewsPaged(
    @SerializedName("data")
    val `data`: List<DataXXXXXXXXXXXXXXXXXXXXXXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)