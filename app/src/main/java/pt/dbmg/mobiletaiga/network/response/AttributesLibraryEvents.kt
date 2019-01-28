package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesLibraryEvents(
    @SerializedName("changedData")
    val changedData: ChangedData,
    @SerializedName("createdAt")
    val createdAt: String, // 2017-09-23T00:00:37.565Z
    @SerializedName("event")
    val event: String, // updated
    @SerializedName("notes")
    val notes: Any, // null
    @SerializedName("nsfw")
    val nsfw: Boolean, // false
    @SerializedName("private")
    val `private`: Boolean, // false
    @SerializedName("progress")
    val progress: Int, // 2
    @SerializedName("rating")
    val rating: Int, // 14
    @SerializedName("reconsumeCount")
    val reconsumeCount: Int, // 0
    @SerializedName("reconsuming")
    val reconsuming: Boolean, // false
    @SerializedName("status")
    val status: String, // completed
    @SerializedName("timeSpent")
    val timeSpent: Int, // 0
    @SerializedName("updatedAt")
    val updatedAt: String, // 2017-09-23T00:00:37.565Z
    @SerializedName("volumesOwned")
    val volumesOwned: Int // 0
)