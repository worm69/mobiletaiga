package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesXXXXXXXXXXXXXXXXX(
    @SerializedName("createdAt")
    val createdAt: String, // 2013-03-03T23:07:42.713Z
    @SerializedName("finishedAt")
    val finishedAt: String, // 2016-01-15T05:53:48.037Z
    @SerializedName("notes")
    val notes: Any, // null
    @SerializedName("private")
    val `private`: Boolean, // false
    @SerializedName("progress")
    val progress: Int, // 13
    @SerializedName("progressedAt")
    val progressedAt: String, // 2016-01-15T05:53:48.037Z
    @SerializedName("rating")
    val rating: String, // 3.5
    @SerializedName("ratingTwenty")
    val ratingTwenty: Int, // 14
    @SerializedName("reactionSkipped")
    val reactionSkipped: String, // unskipped
    @SerializedName("reconsumeCount")
    val reconsumeCount: Int, // 0
    @SerializedName("reconsuming")
    val reconsuming: Boolean, // false
    @SerializedName("startedAt")
    val startedAt: Any, // null
    @SerializedName("status")
    val status: String, // completed
    @SerializedName("updatedAt")
    val updatedAt: String, // 2016-01-15T05:53:48.037Z
    @SerializedName("volumesOwned")
    val volumesOwned: Int // 0
)