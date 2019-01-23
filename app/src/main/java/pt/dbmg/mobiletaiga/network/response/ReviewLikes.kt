package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class ReviewLikes(
    @SerializedName("data")
    val `data`: List<DataReviewLikes>
)