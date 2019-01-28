package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AllTime(
    @SerializedName("total_media")
    val totalMedia: Int, // 273
    @SerializedName("total_progress")
    val totalProgress: Int, // 5728
    @SerializedName("total_time")
    val totalTime: Int // 144734
)