package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class ReviewLikesPaged(
    @SerializedName("data")
    val `data`: List<DataReviewLikes>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)