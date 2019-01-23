package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class CommentsPaged(
    @SerializedName("data")
    val `data`: List<DataXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)